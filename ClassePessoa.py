class Pessoa:
    def __init__(self, nomeAluno, pesoAluno, idadeAluno, comendo = False, falando = False, dormindo = False):
        self.nome = nomeAluno
        self.peso = pesoAluno
        self.idade = idadeAluno
        self.comendo = comendo
        self.falando = falando
        self.dormindo = dormindo

    def comer(self, alimento):
        if not self.comendo and not self.falando and not self.dormindo:
            print(f"{self.nome} foi comer {alimento}")
            self.comendo = True
        elif self.comendo:
            print(f"{self.nome} ainda está comendo")
        elif self.falando:
            print(f"{self.nome} não pode comer enquanto fala")
        elif self.dormindo:
            print(f"{self.nome} não pode comer enquanto dorme")
    
    def parardecomer(self):
        if self.comendo:
            print(f"{self.nome} parou de comer")
            self.comendo = False
        else:
            print(f"{self.nome} não está comendo")
    
    def falar(self, frase):
        if not self.falando and not self.comendo and not self.dormindo:
            print(f"{self.nome} falou: {frase}")
            self.falando = True
        elif self.falando:
            print(f"{self.nome} ainda está falando")
        elif self.comendo:
            print(f"{self.nome} não pode falar enquanto come")
        elif self.dormindo:
            print(f"{self.nome} não pode falar enquanto dorme")
    
    def parardefalar(self):
        if self.falando:
            print(f"{self.nome} parou de falar")
            self.falando = False
        else:
            print(f"{self.nome} não está falando")
        
    def dormir(self):
        if not self.dormindo and not self.comendo and not self.falando:
            print(f"{self.nome} foi dormir")
            self.dormindo = True
        elif self.dormindo:
            print(f"{self.nome} já está dormindo")
        elif self.comendo:
            print(f"{self.nome} não pode dormir enquanto come")
        elif self.falando:
            print(f"{self.nome} não pode dormir enquanto fala")
    
    def acordar(self):
        if self.dormindo:
            print(f"{self.nome} acordou")
            self.dormindo = False
        else:
            print(f"{self.nome} não está dormindo")
        

p1 = Pessoa("Izair", 70, 27)


p1.comer("coxinha")
p1.comer("torta de maçã")
p1.falar("Olá, mundo!")
p1.dormir()
p1.parardecomer()