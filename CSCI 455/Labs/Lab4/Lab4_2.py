from gmpy2 import *
# import library
from gmpy2 import mpz

def main():
#Encryption
	#c = mpz(28822365203577929536184039125870638440692316100772583657817939349051546473185)
	#n = mpz(70736025239265239976315088690174594021646654881626421461009089480870633400973)
	#e = mpz(3)

#Testing with easier numbers Answer shouls be 611 and Original message 119
	c = mpz(595)
	n = mpz(11)
	e = mpz(3)

#fermat's algorithm to obtain p and q from n
	a = gmpy2.isqrt(n)
	b2 = gmpy2.mul(a, a) - n

	while (not gmpy2.is_square(b2))
		a = a + 1
		b2 = gmpy2.mul(a,a) - n
		p = a - gmpy2.isqrt(b2) 
		q = a - gmpy2.isqrt(b2)
	return 

#Decryption
	phi = gmpy2.mul(p-1,q-1)
	d = gmpy2.invert(e, phi)
	m = gmpy2.powmod(c, d, n)
	print("The private key component is: ", d)
	print("The original message is: ", m)
main()