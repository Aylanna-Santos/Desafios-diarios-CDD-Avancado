# Jogo da velha
pergunta = 0

matriz = [[" ", " ", " "],
          [" ", " ", " "],
          [" ", " ", " "]]

def exibir_matriz(matriz):
  for i in range(3):
    linha = " | ".join(matriz[i])
    print(linha)
    if i < 2:
      print("---------")

print("Jogo da Velha:")
exibir_matriz(matriz)
print()

while True:
  linha = int(input("Escolha uma linha de 0 a 2: "))
  coluna = int(input("Escolha uma coluna de 0 a 2: "))
  letra = input("Digite 'o' ou 'x': ").upper()
  print()

  if linha > 2 or linha < 0:
    print("Não é permitido usar outros números além de 0 a 2")
  elif coluna > 2 or coluna < 0:
    print("Não é permitido usar outros números além de 0 a 2")
  elif matriz[linha][coluna] != " ":
    print(f"A posição ({linha},{coluna}) já foi preencida")
  elif letra not in ["X", "O"]:
    print("Não é permitido usar outras letras além de 'x' e 'o'") 
  else:
      matriz[linha][coluna] = letra
  print("Jogo da Velha:")
  exibir_matriz(matriz)
  print()

  while True:
    pergunta = input("Deseja continuar?\n Digite 's' para jogar e 'n' para sair. ").lower()
    if pergunta != "s" and pergunta != "n":
        print("Opção inválida")
    elif pergunta == "s":
        break
    elif pergunta == "n":
        break
  if pergunta == "n":
    break
  print()