import adivinhacao;
import forca;

print('Escolha seu jogo')
print('1 - Forca / 2 - Adivinhação')

jogo = int(input('Qual o seu jogo?'))

if (jogo == 1):
  print('Jogando Forca')
  forca.jogar()
elif (jogo == 2):
  print('Jogando Adivinhação')
  adivinhacao.jogar()

