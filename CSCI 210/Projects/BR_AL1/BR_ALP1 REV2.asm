;***********************************************************************************************************
;******************	Author:						Brandon Rowe					****************************
;******************	Course Title_Section:		CSCIU210_01						****************************
;******************	Creation Date:				12/08/2017						****************************
;******************	Program Name:		Assembly Language Assignment 1			****************************
;******************	Revision:						2							****************************
;******************	Program Description: Displays menu and messages using loops ****************************
;***********************************************************************************************************
;***********************************************************************************************************
;********************** Revisions to comments and added wage calulator *************************************


.386
.MODEL flat, stdcall
.STACK 4096

ExitProcess PROTO, DWExitProcess: DWORD

INCLUDE Irvine16.inc

;-----------------------------------------------------------------------------------------------------------------------------------
; Declaring variable, mostly as strings.

.DATA
	_input1	DWORD ?
	_input2	DWORD ?
	_input3	DWORD ?
	_new1	DWORD ?
	_new2	DWORD ?
	_lucky	DWORD ?

	GreenTextOnGray		= green + (white * 16)
	DefaultColor		= black


	_nameString					db	"My name is B Rowe",	13, 10, 0
	_titleString				db	"Assembly Language Project 1",	13, 10, 0

	_replyString1				db	"The number you entered is: ",0

	_promptString1				db	"Please enter a Signed integer: ",0
	_promptString2				db	"Please enter another Signed integer: ",0
	_promptString3				db	"Please enter your favorite lucky number: ",0

	_binaryString				db	"The binary equivalent is: ", 0
;	_decimalString				db	"The decimal equivalent is: ", 0
	_hexadecimalString			db	"The hexadecimal equivalent is: ",0

	_sumTwoString				db	"The sum of the two integers you entered is: ",0
	_productTwoString 			db	"The product of the two integers you entered is: ",0
	_addTwoString				db	"If the first number you entered would have been 2 numbers greater,",0
	_addTwoEndStr				db	"it would have been: ",0
	_minusThreeString			db	"If the second number you entered would have been 3 numbers less,",0
	_minusThreeEndStr			db	"it would have been: ",0
	_sumNewNumsString 			db	"Had you entered these numbers, your sum would have been: ",0
	_prodNewNumsString 			db	"Had you entered these numbers, your product would have been: ",0
	_interestingString			db	"Interesting, your favorite lucky number is",0
	_interetsingEndStr			db	", so is mine!",0

	_twosCompString 			db "The Two's Complement of your favorite lucky number is shown in the EAX register below.",0
	_showOffString 				db "This program shows off my skills in Assembly Language programming!",0

	_prompt						byte	"*****This program has Successfully Ended*****", 0

;-----------------------------------------------------------------------------------------------------------------------------------
;New data for wage calulator. I always like to do wage calculators with new languages. 


_wageVal		DWORD ?
_hoursVal		DWORD ?
_payVal			DWORD ?

_payString		db	"Please enter your hourly pay rate. ",0
_hoursString	db	"Please enter the hours you worked this week. ",0	
_payOutString	db	"Your (rounded Int) weekly pay should be: ",0

;-----------------------------------------------------------------------------------------------------------------------------------
;Begin main code procedure which is the length of the entire project.

.CODE
	Main PROC
		
		Call	ColorChange
		Call	Crlf
		Call	NameClass
		Call	PayCalc
		Call	InputOneTwo
		Call	SumTwoStr
		Call	iMulStr
		Call	addTwoStr
		Call	sumTwoStr
		Call	minusThreeStr
		Call	sumTwo
		Call	prodNewNum
		Call	Lucky
		Call	TwosComp
		Call	ShowOff
		Call	EndPro

	Main ENDP
		                                        
;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen.

	NameClass	Proc

		mov		EDX, offset _nameString
		call	WriteString

;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen.

		mov		EDX, offset _titleString
		call	WriteString
		call	crlf
		call	crlf

	NameClass EndP
;-----------------------------------------------------------------------------------------------------------------------------------
;Ask for hours and pay rate to calculate weekly pay.

	PayCalc	Proc

		mov		EDX, offset _payString
		call	WriteString
		call	ReadInt				
		mov		_wageVal, eax
		call	crlf

		mov		EDX, offset _hoursString
		call	WriteString
		call	ReadInt		
		mov		_hoursVal, eax
		call	crlf

		mov		EDX, offset _payOutString
		call	WriteString
		mov		eax, _wageVal
		mov		ebx, _hoursVal
		imul	eax, ebx
		call	WriteDec
		mov		_payVal, eax
		call	crlf
		call	crlf
		call	crlf

	PayCalc Endp

;-----------------------------------------------------------------------------------------------------------------------------------
;Move prompt to edx, print to screen, read user intInput, move val in eax to _input1
	
	InputOneTwo Proc

		mov		EDX, offset _promptString1
		call	WriteString
		call	ReadInt				
		mov		_input1, eax
		call	crlf

;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen, write integer to screen, break to next line.

		mov		EDX, offset _replyString1
		call	WriteString
		call	WriteInt
		call	crlf
		call	HexPro
		call	crlf
		call	BiPRo
		call	crlf
	
;-----------------------------------------------------------------------------------------------------------------------------------
;Move prompt to edx, print to screen, read user intInput, move val in eax to _input2.

		mov		EDX, offset _promptString2		
		call	WriteString
		call	ReadInt		
		mov		_input2, eax					
		call	crlf

;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen, print int to screen.

		mov		EDX, offset _replyString1
		call	WriteString
		call	WriteInt
		call	crlf
		call	HexPro
		call	crlf
		call	BiPRo
		call	crlf

	InputOneTwo Endp

;-----------------------------------------------------------------------------------------------------------------------------------
;Begin number calculations with input.
;Move string to edx, print to screen, move input1 to eax and input2 to ebx, add two reg vals together, print int(result) to screen.

	SumTwoStr	Proc

		mov		EDX, offset _sumTwoString
		call	WriteString
		mov		eax, _input1
		mov		ebx, _input2
		add		eax, ebx
		call	WriteInt
		call	crlf
		call	crlf

	SumTwoStr	Endp

;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen, move input1 to eax and input2 to ebx, multiply two reg vals together, print int(result) to screen.

	iMulStr	Proc

		mov		EDX, offset _productTwoString
		call	WriteString
		mov		eax, _input1
		mov		ebx, _input2
		imul	eax, ebx
		call	WriteInt
		call	crlf
		call	crlf

	iMulStr	Endp

;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen, move input1 to eax and add two to val in eax, print int(result) to screen.

	addTwoStr	Proc
		
		mov		EDX, offset _addTwoString
		call	WriteString
		mov		eax, _input1
		add		eax, 2
		call	crlf

	

;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen, print int to screen, move eax val to new1 var.


		mov		EDX, offset _addTwoEndStr
		call	WriteString
		call	WriteInt
		mov		_new1, eax
		call	crlf
		call	crlf

	addTwoStr	Endp
;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen, move input2 val to eax and subtract three from val in eax, print int(result) to screen.

	minusThreeStr	Proc

		mov		EDX, offset _minusThreeString
		call	WriteString
		mov		eax, _input2
		sub		eax, 3
		call	crlf

;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen, print int to screen, move eax val to new2 var.

		mov		EDX, offset _minusThreeEndStr
		call	WriteString
		call	WriteInt
		mov		_new2, eax
		call	crlf
		call	crlf

	minusThreeStr	Endp

;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen, move var new1 to eax, add var new2 to eax, print int(result) to screen.

	sumTwo	Proc

		mov		EDX, offset _sumNewNumsString
		call	WriteString
		mov		eax, _new1
		add		eax, _new2
		call	WriteInt
		call	crlf
		call	crlf

	sumTwo	Endp

;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen, move var new1 to eax, multiply var new2 to eax, print int(result) to screen.

	prodNewNum Proc

		mov		EDX, offset _prodNewNumsString
		call	WriteString
		mov		eax, _new1
		imul	eax, _new2
		call	WriteInt
		call	crlf
		call	crlf

	prodNewNum Endp

;-----------------------------------------------------------------------------------------------------------------------------------
;Move prompt to edx, print to screen, read input int, move val in eax to input3.

	Lucky	Proc

		mov		EDX, offset _promptString3
		call	WriteString
		call	ReadInt
		mov		_input3, EAX
		call	crlf

;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen, print int to screen, move val in eax to lucky var.

		mov		EDX, offset _interestingString
		call	WriteString
		call	WriteInt
		mov		_lucky, eax
		call	crlf

;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen.

		mov		EDX, offset	_interetsingEndStr
		call	WriteString
		call	crlf
		call	crlf

	Lucky	Endp

;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen, take two's comp of val in eax, print regs to screen.

	TwosComp	Proc

		mov		EDX, offset _twosCompString
		call	WriteString
		neg		eax
		call	DumpRegs
		call	crlf

	TwosComp	Endp

;-----------------------------------------------------------------------------------------------------------------------------------
;Move string to edx, print to screen. 
	
	ShowOff	Proc

		mov		EDX, offset _showOffString
		call	WriteString
		call	crlf
		call	crlf

	ShowOff	Endp

;-----------------------------------------------------------------------------------------------------------------------------------
;move hexString to edx, print to screen, print input val as hex.

	HexPro Proc

			mov		EDX, offset	_hexadecimalString
			call	WriteString
			call	WriteHex
			call	crlf

	HexPro EndP

;-----------------------------------------------------------------------------------------------------------------------------------
;move biString to edx, print to screen, print input val as binary.
	
	BiPro	Proc

		mov		EDX, offset	_binaryString
		call	WriteString
		call	WriteBin
		call	crlf
		call	crlf

	BiPro EndP

;-----------------------------------------------------------------------------------------------------------------------------------
;Move prompt to edx, print to screen.
	
	EndPro	Proc

		mov		EDX, offset _prompt
		call	WriteString
		call	crlf
		call	crlf

;-----------------------------------------------------------------------------------------------------------------------------------
;Exit application.

		INVOKE	ExitProcess, 0

	EndPro	Endp
;-----------------------------------------------------------------------------------------------------------------------------------
;Change color of text on screen. 

	ColorChange PROC

		mov		eax, GreenTextOnGray				
		call	SetTextColor					
		call	clrscr							
		ret

	ColorChange ENDP

;-----------------------------------------------------------------------------------------------------------------------------------

End		Main
