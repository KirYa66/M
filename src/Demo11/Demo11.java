package Demo11;

import java.util.*;
class Demo11{
    public static void main(String[] args){
// Объект для генерирования случайных чисел:
        Random rnd=new Random();
// Количество разных случайных чисел:
        int n=12;
// Множество чисел:
        HashSet<Integer> nums=new HashSet<>();
// Генерирование случайных чисел:
        while(nums.size()<n){
            nums.add(rnd.nextInt(20)+1);
        }
// Результат:
        System.out.println(nums);
    }
}