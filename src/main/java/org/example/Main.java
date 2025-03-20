package org.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Solução para o problema "Longest Consecutive Sequence" do LeetCode
 *
 * O problema pede para encontrar o comprimento da sequência mais longa
 * de elementos consecutivos em um array não ordenado.
 *
 * Por exemplo, para [100,4,200,1,3,2], a sequência consecutiva mais longa
 * é [1,2,3,4], então o resultado é 4.
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        // Caso base: se o array estiver vazio, retorna 0
        if (nums.length == 0) {
            return 0;
        }

        // Converter o array para um Set para ter acesso O(1) aos elementos
        // Isso ajuda muito na performance, pois buscar no Set é muito rápido!
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums) {
            numSet.add(num);
        }

        // Variável para guardar o tamanho da maior sequência encontrada
        int longestStreak = 0;

        // Percorrer cada número no Set
        for(int num : numSet) {
            // Verificar se o número é o início de uma sequência
            // Se num-1 não existir no Set, então num é o início de uma possível sequência
            if(!numSet.contains(num - 1)) {
                // Encontramos um possível início de sequência!
                int currentNum = num;
                int currentStreak = 1; // Começa com 1 porque já temos o primeiro número

                // Procurar por números consecutivos (num+1, num+2, etc.)
                while(numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // Atualizar o tamanho da maior sequência se necessário
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        // Retornar o comprimento da maior sequência encontrada
        return longestStreak;
    }

    // Método para testar a solução com os exemplos do problema
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Exemplo 1
        int[] nums1 = {100,4,200,1,3,2};
        System.out.println("Exemplo 1: " + solution.longestConsecutive(nums1)); // Deve imprimir 4

        // Exemplo 2
        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        System.out.println("Exemplo 2: " + solution.longestConsecutive(nums2)); // Deve imprimir 9

        // Exemplo 3
        int[] nums3 = {1,0,1,2};
        System.out.println("Exemplo 3: " + solution.longestConsecutive(nums3)); // Deve imprimir 3
    }
}
