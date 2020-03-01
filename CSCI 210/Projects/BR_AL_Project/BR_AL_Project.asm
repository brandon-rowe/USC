;***********************************************************************************************************
;******************	Author:						Brandon Rowe					****************************
;******************	Course Title_Section:		CSCIU210_02						****************************
;******************	Creation Date:				12/08/2017						****************************
;******************	Program Name:		Assembly Language Final Project			****************************
;******************	Revision:						1							****************************
;******************	Program Description: Displays menu and messages using loops ****************************
;***********************************************************************************************************

INCLUDE Irvine32.inc
project EQU		<"Assembly Language Course Project", 0>

;------------------------------------------------------------------------------------------------------------------
;Declare variable for strings, counter, text/background color, array and prompts.
.data

	_myName				byte		"B Rowe",0dh, 0ah, 0
	_nameLength			= ($ - _myName) - 1

	counter				dword ?
	menuChoice			dword ?
	loopCount			= 3
	BlueTextOnGray		= blue + (lightGray * 16)
	DefaultColor		= lightGray + (black * 16)

	arrayD				dword	12345h, 23456h, 34567h, 45678h, 56789h, 67890h

	_prompt2			byte	project
	_prompt3			byte	"Select a Main Meal Option", 0
	_prompt4			byte	"1. Turkey Sandwich", 0dh, 0ah
						byte	"2. Hot Ham and Cheese Sandwich", 0dh, 0ah
						byte	"3. Garden Salad", 0dh, 0ah
						byte	"4. Exit", 0dh, 0ah
						byte	"Choice>", 0
	_prompt6			byte	"Sorry, but we SOLD OUT of that Main Meal selection. Please select another.", 0
	_prompt8			byte	3 DUP(" * *Thank You! * *"), 0
	_prompt10			byte	"*****This program has Successfully Ended*****", 0
	_prompt11			byte	"This program will now exit!", 0

	_invalidChoice1		byte	"The number you have entered is not a valid menu choice.", 0
	_invalidChoice2		byte	"Please select a valid menu choice from below.", 0
	_greatChoice		byte	"You have chosen a great meal. It will be coming up shortly.", 0

	_pleasepay			byte	"Please pay at the counter and we hope that you will come back again soon.",0



;------------------------------------------------------------------------------------------------------------------

.code      
              
	main proc

		call ColorChange
		call RevName
		call WriteProgNum
		call WriteMenu
		call ReadMenu

	exit
	main endp


;-------------------------------------------------------------------------------------------------------------------
;Put name into stack. Use nameLength for loop dec, l1 gets char and pushes to stack, inc esi by 1, loops once for each char in nameLength
;Put name from stack in revers, store it in _myName, L2 reads each char into string and writes to screen.

	RevName PROC

		mov	 	ecx,_nameLength					
		mov	 	esi,0							

		L1:	movzx eax,_myName[esi]				
			push eax							
			inc	 esi							
			loop L1 
			mov	 	ecx, _nameLength				
			mov	 	esi, 0							

		call Crlf                     			

		L2:	pop  eax							
			mov	 _myName[esi],al				
			call WriteChar						
			inc	 esi							
			loop L2                  			

		call Crlf               			
		call Crlf                			
		ret

	RevName ENDP

;------------------------------------------------------------------------------------------------------------------
;  Put prompt in edx, print to screen.

	ThankYou PROC

		mov		edx, OFFSET _prompt8			
		call	WriteString						
		call	crlf							
		ret

	ThankYou ENDP

;------------------------------------------------------------------------------------------------------------------
;Put prompt into edx, print to screen.
	WriteProgNum PROC

		mov		edx,OFFSET _prompt2				
		call	WriteString						
		call	crlf							
		call	crlf							
		ret

	WriteProgNum ENDP

;------------------------------------------------------------------------------------------------------------------
;Put prompt3 into edx, print to screen, repeat with prompt4.

	WriteMenu PROC

		mov		edx, OFFSET _prompt3				
		call	WriteString						
		call	crlf							
		call	crlf		
						
		mov		edx, OFFSET _prompt4 			
		call	WriteString						
		ret
	WriteMenu ENDP

;------------------------------------------------------------------------------------------------------------------
;Compares choice selected, jumps to selection. 

	ReadMenu PROC

		call	ReadInt							
		call	crlf							
		mov		menuChoice, eax					

		cmp		menuChoice, 1					
			je	Choice1							
		cmp		menuChoice, 2					
			je	Choice2							
		cmp		menuChoice, 3					
			je	Choice3							
		cmp		menuChoice, 4					
			je Choice4							
		cmp		menuChoice, 4					
			je	InvalidChoice					
		cmp		menuChoice, 0					
			je	InvalidChoice					
		ret

	ReadMenu ENDP



;------------------------------------------------------------------------------------------------------------------
;Put invchoice string into edx, write to screen, place invchoice string2 in edx, write to screen.
	InvalidChoice PROC

		mov		edx, OFFSET _invalidChoice1		
		call	WriteString						
		call	crlf							
		call	crlf							
		mov		edx, OFFSET _invalidChoice2		
		call	WriteString						
		call	crlf							
		call	crlf							
		call	WriteMenu
		call	ReadMenu

	InvalidChoice ENDP

;------------------------------------------------------------------------------------------------------------------
;Put string grtChoice in edx, print to screen, put plsPay in edx, print to screen.
	Choice1 PROC

				mov		edx, OFFSET _greatChoice		
		call	WriteString						
		call	crlf							
		call	crlf							
		mov		edx, OFFSET _pleasepay			
		call	WriteString					
		call	crlf
		call	crlf						
		call	ThankYou
		call	crlf
		call	crlf	
		call	ThankYou
		call	crlf
		call	crlf
		mov		edx, OFFSET _greatChoice		
		call	WriteString						
		call	crlf							
		call	crlf							
		mov		edx, OFFSET _pleasepay			
		call	WriteString					
		call	crlf
		call	ThankYou
		call	crlf
		call	sumArrayD

	Choice1 ENDP

;------------------------------------------------------------------------------------------------------------------
;Put prompt into edx reg, print to screen, write to menu and read.
	Choice2 PROC

		mov		edx, OFFSET _prompt6			
		call	WriteString						
		call	crlf							
		call	crlf							
		call	WriteMenu
		call	ReadMenu

	Choice2 ENDP
	
;------------------------------------------------------------------------------------------------------------------
; Put string in edx reg, print to screen, put plsPay string in edx reg, print to screen.
	Choice3 PROC

		mov		edx, OFFSET _greatChoice		
		call	WriteString						
		call	crlf							
		call	crlf							
		mov		edx, OFFSET _pleasepay			
		call	WriteString					
		call	crlf						
		call	ThankYou
		call	sumArrayD

	Choice3 ENDP

;------------------------------------------------------------------------------------------------------------------
;move prompt 11 to edx and print. 
	Choice4 PROC

		mov		edx, OFFSET _prompt11			
		call	WriteString						
		call	crlf							
		call	crlf							
		call	waitmsg

	Choice4 ENDP

;------------------------------------------------------------------------------------------------------------------
; reset regs to 0, put length of array in ecx for counter, start loop, add array element.
	sumArrayD PROC

		mov		eax, 0							
		mov		ebx, 0							
		mov		ecx, 0							
		mov		edx, 0							
		mov		esi, 0							

		mov ecx, LENGTHOF arrayD				
		L1:  									
			add eax, arrayD[esi]				
			add esi, 4							
		loop L1									
		call  Crlf								
		call DUMPREGS
		call MoreReverses

	sumArrayD ENDP

;------------------------------------------------------------------------------------------------------------------

	MoreReverses PROC

		call RevName
		call RevName
		call RevName
		call crlf								
		Call EndLoop

	MoreReverses ENDP

;------------------------------------------------------------------------------------------------------------------
;Use loopCount in ecx for decrement, move edx to reg, print, call loop.

	EndLoop PROC
		mov		ecx, loopCount					

		L2:
			mov		edx, OFFSET _prompt10		
			call	WriteString					
			call	crlf						
		loop L2									
		call	waitmsg							
		exit									
	EndLoop ENDP

;------------------------------------------------------------------------------------------------------------------
;move the color to eax, set the color, clear the screen.

	ColorChange PROC

		mov		eax,BlueTextOnGray				
		call	SetTextColor					
		call	clrscr							
		ret

	ColorChange ENDP

;------------------------------------------------------------------------------------------------------------------



END Main
