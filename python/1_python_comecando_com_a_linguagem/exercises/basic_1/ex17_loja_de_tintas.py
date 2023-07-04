
metros = int(input('Digite o tamanho em metros quadrados da área a ser pintada: '))
lata_de_tinta = 54
valor_da_lata = 80

latas_necessarias = round((metros/lata_de_tinta)+ 0.5)
valor_total = latas_necessarias * valor_da_lata

print('Você irá precisar comprar {} latas de tinta e o total é R${} reais'.format(latas_necessarias, valor_total))