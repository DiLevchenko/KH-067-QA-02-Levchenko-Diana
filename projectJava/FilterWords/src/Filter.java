import java.sql.SQLOutput;
import java.util.Scanner;

import static sun.nio.ch.IOStatus.check;

public class Filter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] words;
        boolean end = false;
        do {
            System.out.println("Пожалуйста, введите слова через запятую, минимальное количество слов - 3.");
            String enteredWords = sc.nextLine();
            words = enteredWords.split(", ");
            if (!enteredWords.contains(", ") || words.length < 3) {
                System.out.println("Неверное количество слов, попробуйте снова. ");
            }else
            {
                end = true;
            }
        }while (!end);

        boolean shutoff = false;
        do{
            System.out.println("Пожалуйста, выберите фильтр: ");
            System.out.println("1 - выбрать слова с длиной меньше либо равно введенному значению");
            System.out.println("2 - выбрать слова, начинающиеся с выбранной буквы");
            System.out.println("3 - выбрать слова, заканчивающиеся на выбранную букву");
            System.out.println("4 - выбрать слова, которые в себе содержат выбранную последовательность букв");
            System.out.println("0 - выйти из программы");
            System.out.println("Введите номер выбранного фильтра");
            int filter = sc.nextInt();
            boolean success = false ;

            switch (filter) {
                case 1:
                    do {
                        System.out.println("Введите сколько букв должно содержать слово: ");
                        int length = sc.nextInt();

                        String[] findedWords = new String[words.length];
                        for (int i = 0; i < words.length; i++) {
                            if (words[i].length() <= length) {
                                findedWords[i] = words[i];
                            }
                        }
                        String allFindedWords = "";
                        for (int i = 0; i < findedWords.length; i++)
                        {
                            if ( findedWords[i] != null)
                            {
                                allFindedWords += findedWords[i] + "\n";
                            }
                        }

                        if (allFindedWords.trim().length()<=0)
                        {
                            System.out.println("По Вашему запросу ничего не найдено, попробуйте снова");
                            continue;
                        }else
                        {
                            System.out.println("Слова, найденные по вашему запросу: ");
                            System.out.println(allFindedWords);
                            success = true;
                        }
                    } while (!success);
                    break;
                case 2:
                    do {
                        System.out.println("Введите с каких букв должно начинаться слово: ");
                        String firstLetters = sc.next();

                        String[] findedWords = new String[words.length];
                        for (int i = 0; i < words.length; i++) {
                            if (words[i].startsWith(firstLetters)) {
                                findedWords[i] = words[i];
                            }
                        }
                        String allFindedWords = "";
                        for (int i = 0; i < findedWords.length; i++)
                        {
                            if ( findedWords[i] != null)
                            {
                                allFindedWords += findedWords[i] + "\n";
                            }
                        }

                        if (allFindedWords.trim().length()<=0)
                        {
                            System.out.println("По Вашему запросу ничего не найдено, попробуйте снова");
                            continue;
                        }else
                        {
                            System.out.println("Слова, найденные по вашему запросу: ");
                            System.out.println(allFindedWords);
                            success = true;
                        }
                    } while (!success);
                    break;
                case 3:
                    do {
                        System.out.println("Введите буквы, на которые заканчивается слово: ");
                        String lastLetters = sc.next();

                        String[] findedWords = new String[words.length];
                        for (int i = 0; i < words.length; i++) {
                            if (words[i].endsWith(lastLetters)) {
                                findedWords[i] = words[i];
                            }
                        }
                        String allFindedWords = "";
                        for (int i = 0; i < findedWords.length; i++)
                        {
                            if ( findedWords[i] != null)
                            {
                                allFindedWords += findedWords[i] + "\n";
                            }
                        }

                        if (allFindedWords.trim().length()<=0)
                        {
                            System.out.println("По Вашему запросу ничего не найдено, попробуйте снова");
                            continue;
                        }else
                        {
                            System.out.println("Слова, найденные по вашему запросу: ");
                            System.out.println(allFindedWords);
                            success = true;
                        }
                    } while (!success);
                    break;
                case 4:
                    do {
                        System.out.println("Введите буквы, что содержаться в слове: ");
                        String cont = sc.next();

                        String[] findedWords = new String[words.length];
                        for (int i = 0; i < words.length; i++) {
                            if (words[i].contains(cont)) {
                                findedWords[i] = words[i];
                            }
                        }
                        String allFindedWords = "";
                        for (int i = 0; i < findedWords.length; i++)
                        {
                            if ( findedWords[i] != null)
                            {
                                allFindedWords += findedWords[i] + "\n";
                            }
                        }

                        if (allFindedWords.trim().length()<=0)
                        {
                            System.out.println("По Вашему запросу ничего не найдено, попробуйте снова");
                            continue;
                        }else
                        {
                            System.out.println("Слова, найденные по вашему запросу: ");
                            System.out.println(allFindedWords);
                            success = true;
                        }
                    } while (!success);
                    break;
                case 0:
                    shutoff = true;
                    break;
            }
        }while(!shutoff);
    }
}