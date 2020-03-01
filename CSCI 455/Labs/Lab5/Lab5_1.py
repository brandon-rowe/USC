from gmpy2 import *
# import library
from gmpy2 import mpz


def main():
#Encryption
	c = mpz(28822365203577929536184039125870638440692316100772583657817939349051546473185)
	n = mpz(70736025239265239976315088690174594021646654881626421461009089480870633400973)
	e = mpz(3)
	p = mpz(238324208831434331628131715304428889871)
	q = mpz(296805874594538235115008173244022912163)
#Decryption
	phi = gmpy2.mul(p-1,q-1)
	d = gmpy2.invert(e, phi)
	m = ("I owe you $2000.")
	hexM = ''.join(hex(ord(x))[2:] for x in m)
	intM = int(hexM, 16)

	intS = gmpy2.powmod(intM, d, n)
	hexS = hex(intS)[2:]

	print("The signature of the message in hex string is: ", hexS)
main()


# After changing the message, the output is completely different.
# It looks like it may even be a longer string of characters.
