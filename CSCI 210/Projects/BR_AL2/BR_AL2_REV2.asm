;***********************************************************************************************************
;******************	Author:						Brandon Rowe					****************************
;******************	Course Title_Section:		CSCIU210_02						****************************
;******************	Creation Date:				12/08/2017						****************************
;******************	Program Name:		Assembly Language Assignment 2			****************************
;******************	Revision:						2							****************************
;******************	Program Description: Displays menu and messages using loops ****************************
;***********************************************************************************************************
:*****Updates <<>> Fixed comments sections and updated some of the code to meet requirements. <<>>**********
************************************************************************************************************

INCLUDE Irvine32.inc
project EQU		<"Assembly Language Assignment 2", 0>

;------------------------------------------------------------------------------------------------------------------
;Declare variable for strings, counter, text/background color, array and prompts.

.data

	_myName				byte		"My Name is Brandon Rowe"
	_input				byte ?	


	menuChoice			dword ?
	loopCount			= 3

	arrayD				dword	12345h, 23456h, 34567h, 45678h, 56789h, 67890h

	_prompt2			byte	project
	_prompt3			byte	"Select a Main Meal Option", 0
	_prompt4			byte	"1. Turkey Sandwich", 0dh, 0ah
						byte	"2. Hot Ham and Cheese Sandwich", 0dh, 0ah
						byte	"3. Garden Salad", 0dh, 0ah
						byte	"4. Exit", 0dh, 0ah
						byte	"Choice>", 0
	_prompt5			byte	"You have selected option: ", 0
	_prompt6			byte	"Sorry, but we are all out of that Main Meal selection.", 0
	_prompt7			byte	"I'm sorry, I guess we don't have anything today.", 0
	_prompt8			byte	5 DUP ("** HELP **"), 0
	_prompt9			byte	"We hope that you will come back again.", 0
	_prompt10			byte	"*****This program has Successfully Ended*****", 0


;------------------------------------------------------------------------------------------------------------------
; Begin main procedure that guides the program through other procedures.

.code      
              
	main proc

		call MyName
		call WriteProgNum
		call WriteMenu
		call ReadMenu

	exit

	main endp

;------------------------------------------------------------------------------------------------------------------
;Put myName in edx, print to screen.
   
	MyName PROC

		call	crlf
		mov	edx, OFFSET _myName
		call	WriteString
		call	crlf
		ret

	MyName endp

;------------------------------------------------------------------------------------------------------------------
;Put prompt2 into edx, print to screen.

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
;Compares menuchoice to choice option equivalent. Jumps to selection. 

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
			je	Choice4											
		ret

	ReadMenu ENDP

;------------------------------------------------------------------------------------------------------------------
;Put prompt5 into edx, print to screen, move val of 1 to edx, 

	Choice1 PROC

		call	crlf
		mov		edx, OFFSET _prompt5			
		call	WriteString	

		call	WriteInt			
		call	crlf
				
		mov		edx, OFFSET _prompt6
		call	WriteString
		call	crlf

		mov		edx, OFFSET _prompt3				
		call	WriteMenu
		call	ReadMenu
		call	sumArrayD

	Choice1 ENDP

;------------------------------------------------------------------------------------------------------------------
;Put prompt into edx reg, print to screen, write to menu and read.

	Choice2 PROC

		call	crlf
		mov		edx, OFFSET _prompt5			
		call	WriteString	

		call	WriteInt			
		call	crlf
				
		mov		edx, OFFSET _prompt6
		call	WriteString
		call	crlf

		mov		edx, OFFSET _prompt3				
		call	WriteMenu
		call	ReadMenu
		call	sumArrayD

	Choice2 ENDP
	
;------------------------------------------------------------------------------------------------------------------
; Put string in edx reg, print to screen, put plsPay string in edx reg, print to screen.

	Choice3 PROC

		call	crlf
		mov		edx, OFFSET _prompt5			
		call	WriteString	

		call	WriteInt			
		call	crlf
				
		mov		edx, OFFSET _prompt6
		call	WriteString
		call	crlf
		call	crlf

		mov		edx, OFFSET _prompt3				
		call	WriteMenu
		call	ReadMenu
		call	sumArrayD

	Choice3 ENDP

;------------------------------------------------------------------------------------------------------------------
;Put prompt in edx, print to screen, wait for response.

	Choice4 PROC

		mov		edx, OFFSET _prompt7
		call	WriteString
		call	crlf

		mov		edx, OFFSET _prompt8
		call	WriteString
		call	crlf

		mov		edx, OFFSET _prompt9
		call	WriteString
		call	crlf

		mov		edx, OFFSET _prompt10			
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

	sumArrayD ENDP

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

END Main