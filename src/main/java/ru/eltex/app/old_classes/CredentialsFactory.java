package ru.eltex.app.old_classes;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Фабричный класс синглтон, возвращающий класса Credentials.
 *
 * Паттерн реализован ввиде Double Checked Locking and volatile Singleton.
 */
@Component
public class CredentialsFactory {

    // TODO Если мы используем spring нужно ли писать ЭТО: ??
//    private static volatile CredentialsFactory instance;
//    private CredentialsFactory(){
//        id = 1;
//    }
//
//    public static CredentialsFactory getInstance() {
//        CredentialsFactory localInstance = instance;
//        if (localInstance == null) {
//            synchronized (DeviceFactory.class) {
//                localInstance = instance;
//                if (localInstance == null) {
//                    instance = localInstance = new CredentialsFactory();
//                }
//            }
//        }
//        return localInstance;
//    }

    private static int id;

    private String[] arrayName = { "Николай", "Иван", "Петр", "Антон" };
    private String[] arraySurname = { "Иванов", "Сидоров", "Петров", "Николаев", "Груодис" };
    private String[] arrayPatronymic = { "Петрович", "Иванович", "Сидорович", "Сергеевич" };
    private String[] arrayEmail = { "FIG-01@mail.com", "Kl-1@gmail.com", "5@one.ua", "One@yandex.ru" };
    private Random random = new Random();

    public Credentials getCredentials() {
        return new Credentials(
                id,
                arrayName[ random.nextInt(arrayName.length) ],
                arraySurname[ random.nextInt(arraySurname.length) ],
                arrayPatronymic[ random.nextInt(arrayPatronymic.length) ],
                arrayEmail[ random.nextInt(arrayEmail.length) ]
        );
    }
}
