gender = int(input('Defina seu gênero sendo (1) Homem e (2) Mulher'))
high = float(input('Qual sua altura?'))

if (gender == 1):
    peso_ideal = (72.7 * high) - 58
    print(peso_ideal)
elif (gender == 2):
    peso_ideal = (61.1 * high) - 44.7
    print(peso_ideal) 