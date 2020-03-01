from gmpy2 import *
# import library
from gmpy2 import mpz

def main():
#Encryption
	c = mpz(28822365203577929536184039125870638440692316100772583657817939349051546473185)
	n = mpz(70736025239265239976315088690174594021646654881626421461009089480870633400973)
	e = mpz(3)
#Testing with easier numbers Answer should be 611 and Original message 119
	#c = mpz(595)
	print(c)							#1
	#n = mpz(11)
	print(n)							#2
	#e = mpz(3)
	print(e)							#3
#fermat's algorithm to obtain p and q from n
	a = gmpy2.isqrt(n)					
	print(a)							#4
	b2 = gmpy2.mul(a, a) - n
	print(b2)							#5

	while (not gmpy2.is_square(b2)):
		a = a + 1
		b2 = gmpy2.mul(a,a) - n						
	return 

	p = a - gmpy2.isqrt(b2) 
	print(p)							#6
	q = a + gmpy2.isqrt(b2)
	print(q)							#7
#Decryption
	phi = gmpy2.mul(p-1,q-1)
	print(phi)							#8
	d = gmpy2.invert(e, phi)
	print(d)							#9
	m = gmpy2.powmod(c, d, n)
	print(m)							#10
	print("The private key component is: ", d)#11
	print("The original message is: ", m)#12
main()