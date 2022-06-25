import static javax.swing.JOptionPane.*;
import javax.swing.ImageIcon;
class M{
    public static void main(String[] args){
// Путь к директории с файлами:
        String path="./src/pictures/";
// Текстовый массив с названиями хищников:
        String[] names={"Лев","Тигр","Медведь"};
// Текстовый массив с названиями файлов:
        String[] files={"lion.png","tiger.png","bear.png"};
// Отображение окна с раскрывающимся списком:
        String animal=(String)showInputDialog(
                null, // Ссылка на родительское окно
                "Какого хищника показать?", // Текст над списком
                "Хищники", // Заголовок окна
                QUESTION_MESSAGE, // Пиктограмма
                null, // Изображение для пиктограммы
                names, // Массив определяет содержимое списка
                names[0] // Выбранный элемент списка
        );
// Индекс выбранного элемента:
        int index=0;
// Определение индекса:
        for(int k=1;k<names.length;k++){
            if(animal.equals(names[k])){
                index=k;
                break;
            }
        }
// Создание объекта изображения:
        ImageIcon img=new ImageIcon(path+files[index]);
// Окно с изображением:
        showMessageDialog(null,img,animal,PLAIN_MESSAGE);
    }
}
