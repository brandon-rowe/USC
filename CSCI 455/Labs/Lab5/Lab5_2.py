from gmpy2 import *
# import library
from gmpy2 import mpz


def main():
	M = 'Launch a missile'
	IntS = mpz(int('643D6F34902D9C7EC90CB0B2BCA36C47FA37165C0005CAB026C0542CBDB6802F', 16))
	e = mpz(65537)
	n = mpz(int('AE1CD4DC432798D933779FBD46C6E1247F0CF1233595113AA51B450F18116115', 16))
	M_vrfy = gmpy2.powmod(IntS,e,n)
	hex_M_vrfy = hex(M_vrfy)[2:]
	M_string = bytes.fromhex(hex_M_vrfy).decode() 
	print("The signature of the message in hex string is: ", M_string)
main()

# This is, indeed, Alice's signature since we are able to read the text.
# After changing the signature from 2F to 3F, the message would not decrypt.

