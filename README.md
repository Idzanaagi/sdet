# sdet

Проект UI-автотестов по предоставленным тест-кейсам

:warning: Раннее я не работала ни с чем из заявленного стека (есть небольшой опыт с ООП и unit-тестированием). Этот код - результат 4-х дневного погружения в тему.

### Стек: Java 19, maven, junit5, selenium, allure

### Описание:
- для поиска элементов в основном использовала кастомные атрибуты (меньше вероятности, что их изменят), а также id, xpath и другие;
- написала тесты, стараясь минимизировать дублирование кода (@BeforeEach, @AfterEach) и предусмотрев время на загрузку страницы (implicitlyWait);
- переписала полученное полотнище кода в соответствии с паттерном проектирования Page Object Model;
- прикрутила allure для формирования отчётов.

#### Установка и запуск (windows 11, IntelliJ IDEA):
- склонировать этот репозиторий;
- открыть проект в IDE;
- перейти в src/test/webdriver/WebDriverSetting 
- :exclamation: заменить захардкоженный путь до драйвера на тот, по которому лежит драйвер у вас (второй аргумент System.setProperty);
- перейти в src/test/java/tests/TestClass;
- запустить тесты (Shift+f10).

#### Сформировать отчёт allure (powershell):
```
mvn clean test
allure generate --clean
allure open
```
