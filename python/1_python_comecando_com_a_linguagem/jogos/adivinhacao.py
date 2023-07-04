import random;

def jogar():
   # a = 'bruno';

   # print('Hello ' + a)
   # print(type(a))

   # subst = "Python"
   # verbo = "é"
   # adjetivo = "fantástico"
   # print(subst, verbo, adjetivo, sep="_", end="!\n")

   # dia = 15
   # mes = 10
   # ano = 2015

   # print(dia, mes, ano, sep='/')


   print('Jogo de adivinhação')

   numero_selecionado = round(random.randrange(1, 100))
   print(numero_selecionado)
   pontos = 1000
   # while(trys > 0):
   #     print('rodada {} de 5'.format(n))
   #     chute = int(input('Digite o seu número: '))
   #     print('-------------')
   #     print('Você digitou ', chute)

   #     acerto = numero_selecionado == chute
   #     erro_maior = numero_selecionado < chute
   #     erro_menor = numero_selecionado > chute

   #     if (acerto):
   #         print('voce acertou!!!!!!!')
   #     else:
   #         if(erro_maior):
   #           print('Numero escolhido maior que o numero aleatório')
   #         elif(erro_menor):
   #           print('Numero escolhido menor que o numero aleatório')


   #         print('Número errado')
   #     n = n + 1
   #     trys = trys - 1

   print('Qual nível de dificuldade?')
   print('1 - Fácil / 2 - Médio / 3 - Dificil')
   nivel = int(input('Define o nível: '))

   if (nivel == 1):
      trys = 20
   elif(nivel == 2):
      trys = 10
   else:
      trys = 5

   for rodada in range(1, trys + 1):
      
      print('rodada {} de {}'.format(rodada, trys))
      chute = int(input('Digite o seu número entre 1 e 100: '))
      print('-------------')
      print('Você digitou ', chute)
      
      if(chute < 1 or chute > 100):
         print('Seu número deve estar entre 1 e 100')
         continue
      
      acerto = numero_selecionado == chute
      erro_maior = numero_selecionado < chute
      erro_menor = numero_selecionado > chute

      if (acerto):
         print('voce acertou e fez {} pontos!!!!!!!'.format(pontos))
         break
      else:
         if(erro_maior):
            print('Numero escolhido maior que o numero aleatório')
         elif(erro_menor):
            print('Numero escolhido menor que o numero aleatório')
         pontos_perdidos = abs(numero_selecionado - chute)
         pontos = pontos - pontos_perdidos

   print ('fim de jogo')

if (__name__ == '__main__'):
   jogar()


   # for teste in range(0, 5):
   #     print('dog')
   # number = 2.9032
   # print(len(str(number)))

   # print('R$ {:1.2}'.format(number))