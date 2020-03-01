;***********************************************************************************************************
;******************	Author:						Brandon Rowe					****************************
;******************	Course Title_Section:		CSCIU210_02						****************************
;******************	Creation Date:				12/08/2017						****************************
;******************	Program Name:		Assembly Language Assignment 2			****************************
;******************	Revision:						2							****************************
;******************	Program Description: Displays menu and messages using loops ****************************
;***********************************************************************************************************
;*****Updates <<>> Fixed comments sections and updated some of the code to meet requirements. <<>>**********
;************************************************************************************************************

; Tests the Clrscr, Crlf, DumpMem, ReadInt, SetTextColor, 
; WaitMsg, WriteBin, WriteHex, and WriteString procedures.

INCLUDE Irvine32.inc
project EQU		<"Assembly Language Assignment 2", 0>

.data
COUNT = 3
;BlueTextOnGray = blue + (lightGray * 16)
;DefaultColor = lightGray + (black * 16)

	arrayD				SDWORD	12345678h,1A4B2000h,3434h,7AB9h


	_myName				byte	"My Name is Brandon Rowe"
	_input				byte ?	


	menuChoice			dword ?

	_prompt				byte	"My Name is Brandon Rowe ",0
	_prompt2			byte	project
	_prompt3			byte	"Select a Main Meal Option", 0
	_prompt4			byte	"1. Turkey Sandwich", 0dh, 0ah
						byte	"2. Hot Ham and Cheese Sandwich", 0dh, 0ah
						byte	"3. Garden Salad", 0dh, 0ah
						byte	"4. Exit", 0dh, 0ah
						byte	"Choice>", 0
	_prompt5			byte	"You have selected option: ", 0
	_prompt6			byte	"Sorry but we are all out of that Main Meal selection.", 0
	_prompt7			byte	"I'm sorry, I guess we don't have anything today.", 0
	_prompt8			byte	5 DUP ("** HELP **"), 0
	_prompt9			byte	"We hope that you will come back again.", 0
	_prompt10			byte	"*****This program has Successfully Ended*****", 0

.code
main PROC

	; Set text color to blue text on a light gray background
	;   mov   eax,BlueTextOnGray
	;	call  SetTextColor
	;	call  Clrscr			; clear the screen
	
	mov		edx,	OFFSET	_prompt
	call	WriteString
	call	crlf
	mov		edx,	OFFSET _prompt2
	call	WriteString
	call	crlf
	call	crlf
	call	WriteMenu
	call	crlf

	
	; Display an array using DumpMem.
	
	;mov	esi,OFFSET arrayD	; starting OFFSET
	;mov	ebx,TYPE arrayD	; doubleword = 4 bytes
	;mov	ecx,LENGTHOF arrayD	; number of units in arrayD
	;call	DumpMem			; display memory

     ; Ask the user to input a sequence of signed integers	
     
	call	Crlf			; new line
	mov	ecx,	COUNT
    
	L1: mov		edx, OFFSET WriteMenu		
		call	WriteString							
		call	Crlf	
		call	ReadMenu					
		call	crlf
		call	crlf
	 Loop  L1								

	WriteMenu PROC

		mov		edx, OFFSET _prompt3				
		call	WriteString						
		call	crlf							
		call	crlf		
						
		mov		edx, OFFSET _prompt4 			
		call	WriteString						
		ret

	WriteMenu ENDP

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

	Choice1 PROC

		call	crlf
		mov		edx, OFFSET _prompt5			
		call	WriteString	

		call	WriteInt			
		call	crlf
				
		mov		edx, OFFSET _prompt6
		call	WriteString
		call	crlf			
		call	WriteMenu
		call	ReadMenu
		call	sumArrayD

	Choice1 ENDP

	Choice2 PROC

		call	crlf
		mov		edx, OFFSET _prompt5			
		call	WriteString	

		call	WriteInt			
		call	crlf
				
		mov		edx, OFFSET _prompt6
		call	WriteString
		call	crlf			
		call	WriteMenu
		call	ReadMenu
		call	sumArrayD

	Choice2 ENDP

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
		call	WriteMenu
		call	ReadMenu
		call	sumArrayD

	Choice3 ENDP

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

	sumArrayD PROC

		mov		eax, 0							
		mov		ebx, 0													
		mov		edx, 0							
		mov		esi, 0							

		mov		ecx, COUNT				
		L1:  									
			add eax, arrayD[ecx]				
			sub ecx, 1							
		loop L1									
		call  Crlf								
		call DUMPREGS

	sumArrayD ENDP

; Return console window to default colors.
	call	WaitMsg			; "Press any key..."
;	mov		eax,DefaultColor
;	call	SetTextColor
	call	Clrscr
	
	exit
main ENDP
END main