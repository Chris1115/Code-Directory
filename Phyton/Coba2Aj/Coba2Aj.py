L = int(input('masukkan nilai L'))
R = int(input('masukkan nilai R'))
P = int(input('masukkan nilai P'))

totalFact = 1

powers = 0

X = 0


for i in range(L,R+1):
    totalFact *= i

print(totalFact);
