;***********************************************************************************************************
;******************	Author:						Brandon Rowe					****************************
;******************	Course Title_Section:		CSCIU210_02						****************************
;******************	Creation Date:				12/08/2017						****************************
;******************	Program Name:		Assembly Language Assignment 1			****************************
;******************	Revision:						1							****************************
;******************	Program Description: Displays menu and messages using loops ****************************
;***********************************************************************************************************


.386
.MODEL flat, stdcall
.STACK 4096

ExitProcess PROTO, DWExitProcess: DWORD

INCLUDE Irvine16.inc

;-----------------------------------------------------------------------------
; Declaring variable, mostly as strings.

.DATA
	_input1	DWORD ?
	_input2	DWORD ?
	_input3	DWORD ?
	_new1	DWORD ?
	_new2	DWORD ?
	_lucky	DWORD ?



	_nameString					db	"My name is Brandon Harold Rowe",	13, 10, 0
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

;-----------------------------------------------------------------------------

.CODE
	Main PROC
;new line
		call	crlf

;print name
		mov		EDX, offset _nameString
		call	WriteString

;print class and title
		mov		EDX, offset _titleString
		call	WriteString
		call	crlf
		call	crlf

;prompt user for input
		mov		EDX, offset _promptString1
		call	WriteString
		call	ReadInt				;read the int to input and move to eax reg.
		mov		_input1, eax
		call	crlf

;move replyString to edx reg. Print string & int on screen.
		mov		EDX, offset _replyString1
		call	WriteString
		call	WriteInt
		call	crlf

;move hexString to edx reg. Print hexString & converted hex number.
		mov		EDX, offset	_hexadecimalString
		call	WriteString
		call	WriteHex
		call	crlf

		mov		EDX, offset	_binaryString
		call	WriteString
		call	WriteBin
		call	crlf
		call	crlf

		mov		EDX, offset _promptString2		;move prompt2 to edx reg. Print prompt on screen.
		call	WriteString
		call	ReadInt		
		mov		_input2, eax					;read new int and move input eax reg.
		call	crlf

;move replyString to edx reg. Print string and int entered.
		mov		EDX, offset _replyString1
		call	WriteString
		call	WriteInt
		call	crlf

;move hexString to edx reg. Print hexString & converted hex number.
		mov		EDX, offset	_hexadecimalString
		call	WriteString
		call	WriteHex
		call	crlf

		mov		EDX, offset	_binaryString
		call	WriteString
		call	WriteBin
		call	crlf
		call	crlf
;------------------------------------------------------------------
;Begin number calculations with input.

		mov		EDX, offset _sumTwoString
		call	WriteString
		mov		eax, _input1
		mov		ebx, _input2
		add		eax, ebx
		call	WriteInt
		call	crlf
		call	crlf

		mov		EDX, offset _productTwoString
		call	WriteString
		mov		eax, _input1
		mov		ebx, _input2
		imul	eax, ebx
		call	WriteInt
		call	crlf
		call	crlf

		mov		EDX, offset _addTwoString
		call	WriteString
		mov		eax, _input1
		add		eax, 2
		call	crlf

		mov		EDX, offset _addTwoEndStr
		call	WriteString
		call	WriteInt
		mov		_new1, eax
		call	crlf
		call	crlf

		mov		EDX, offset _minusThreeString
		call	WriteString
		mov		eax, _input2
		sub		eax, 3
		call	crlf
		
		mov		EDX, offset _minusThreeEndStr
		call	WriteString
		call	WriteInt
		mov		_new2, eax
		call	crlf
		call	crlf

		mov		EDX, offset _sumNewNumsString
		call	WriteString
		mov		eax, _new1
		add		eax, _new2
		call	WriteInt
		call	crlf
		call	crlf

		mov		EDX, offset _prodNewNumsString
		call	WriteString
		mov		eax, _new1
		imul	eax, _new2
		call	WriteInt
		call	crlf
		call	crlf

		mov		EDX, offset _promptString3
		call	WriteString
		call	ReadInt
		mov		_input3, EAX
		call	crlf

		mov		EDX, offset _interestingString
		call	WriteString
		call	WriteInt
		mov		_lucky, eax
		call	crlf

		mov		EDX, offset	_interetsingEndStr
		call	WriteString
		call	crlf
		call	crlf
		

		mov		EDX, offset _twosCompString
		call	WriteString
		neg		eax
		call	DumpRegs
		call	crlf

		mov		EDX, offset _showOffString
		call	WriteString
		call	crlf
		call	crlf

		mov		EDX, offset _prompt
		call	WriteString
		call	crlf
		call	crlf

		INVOKE	ExitProcess, 0

	Main ENDP
END	Main




; Additional code
;		mov		EDX, offset	_decimalString
;		call	WriteString
;		call	WriteDec