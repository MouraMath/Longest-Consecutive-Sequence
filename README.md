Longest Consecutive Sequence -- English || Português


English


Problem
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

Solution
This solution uses a HashSet approach:

Create a Set: Convert the array into a HashSet for O(1) lookup.

Iterate and Check: For each number, check if it's the start of a sequence (i.e., num - 1 is not in the set).

Count Sequence: If it's a start, count consecutive numbers until the sequence breaks.

Track Max: Keep track of the longest sequence found.

Advantages
Time Complexity: O(n) as each number is visited at most twice.

Space Efficiency: Uses extra space but allows for fast lookups.

Simplicity: Straightforward logic that's easy to understand and implement.

-------------------------------------------------

Português


Problema
Dado um array não ordenado de inteiros nums, retorne o comprimento da sequência mais longa de elementos consecutivos.

Solução
Esta solução utiliza uma abordagem com HashSet:

Criar um Set: Converte o array em um HashSet para busca em O(1).

Iterar e Verificar: Para cada número, verifica se é o início de uma sequência (ou seja, num - 1 não está no set).

Contar Sequência: Se for um início, conta números consecutivos até a sequência quebrar.

Rastrear Máximo: Mantém o controle da sequência mais longa encontrada.

Vantagens
Complexidade de Tempo: O(n), pois cada número é visitado no máximo duas vezes.

Eficiência de Espaço: Usa espaço extra, mas permite buscas rápidas.

Simplicidade: Lógica direta que é fácil de entender e implementar.
