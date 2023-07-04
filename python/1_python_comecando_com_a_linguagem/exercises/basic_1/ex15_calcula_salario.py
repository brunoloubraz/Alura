salario_bruto = int(input('Digite ao lado o valor do seu salário bruto: '))
ir = salario_bruto * 0.11
inss = salario_bruto * 0.08
sindicato = salario_bruto * 0.05
salario_liquido = salario_bruto - (ir+inss+sindicato)

print('Salário Bruto: R${} reais'.format(salario_bruto))
print('IR (11%): - R${}'.format(ir))
print('INSS (8%): - R${}'.format(inss))
print('Síndicato (5%): - R${}'.format(sindicato))
print('Salário líquido: R${}'.format(salario_liquido))

# n = int(input())
    
# if (n * n >= 20):
#   for x in range(n):
#     print(x * x)
# else:
#   print(n)

# n = int(input())
# arr = []

# for x in range(n + 1):
#     if (x == 0):
#         continue
#     arr.append(x);

# print(*range(1,n+1),sep="")
# print(arr,sep=" ")