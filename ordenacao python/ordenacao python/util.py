import random

class Util:
    """_summary_
        classe responsável por métodos de gestão de listas de números inteiros e listas de palavras
    """
    
    @staticmethod
    def popular_aleatorio_numeros(lista, quantidade, inicio, fim):
        """_summary_
            método de classe que popula uma lista de números inteiros com valores aleatórios
        Args:
            lista (int): estrutura de armazenamento dos números
            quantidade (int): de numeros gerados
            inicio (int): valor inicial da extensão do número gerado
            fim (int): valor final de extensao do número gerado
        """
        for _ in range(quantidade):
            lista.append(random.randrange(inicio, fim))
            
    @staticmethod
    def exibir_lista(lista):
        """_summary_
            método de classe que exibe uma lista de números inteiros ou palavras
        Args:
            lista (int): contém números inteiros ou palavras
        """
        
        for item in lista:
            print(item)
            
    @staticmethod
    def popular_aleatorio_palavras(lista, quantidade, tamanho):
        """_summary_
            método de classe que popula uma lista de palavras
        Args:
            lista (string): estrutura de armazenamento das palavras
            quantidade (int): de palavras geradas
            tamanho (int): das palvras geradas
        """
        letras = "aabcdeefghiijlmnoopqrstuuvwxyz "
        for _ in range(quantidade):
            palavra_gerada = ""
            letra_sorteada = ""
            for i in range(tamanho):
                letra_sorteada = letras[random.randrange(len(letras))]
                palavra_gerada += letra_sorteada
        
            lista.append(palavra_gerada)
        