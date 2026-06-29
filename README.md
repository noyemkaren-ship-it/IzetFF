# izetFF

Собственный транспайлер на Java. Превращает простой текстовый синтаксис в готовый CSS файл с поддержкой тем, позиционирования и динамических размеров.

## Установка
Требования: JDK 17+. Компиляция: `javac org/example/*.java`. Алиас: `alias izetFF='java org.example.Main'`. Запуск: `izetFF input.izet output.css`.

## Синтаксис
izetFF читает `.izet` файл построчно и выполняет команды.

## Темы
`base css black` — чёрная тема. `base css white` — белая тема. Подключают глобальные CSS-переменные и стили.

## Аватары
Используются вместо `base css`. Подключают готовую тему с полным CSS и заданным выравниванием. `avatar: left bleck` — чёрная, влево. `avatar: left white` — белая, влево. `avatar: center bleck` — чёрная, по центру. `avatar: center white` — белая, по центру.

## Базовые стили тегов
`base: h1` `base: h2` `base: h3` `base: h4` `base: h5` `base: h6` — заголовки. `base: p` — параграф. `base: a` — ссылка. `base: button` — кнопка. `base: img` — изображение. `base: ul` — список. `base: ol` — нумерованный список. `base: li` — элемент списка. `base: blockquote` — цитата. `base: code` — встроенный код. `base: pre` — блок кода. `base: table` — таблица. `base: th` — заголовок таблицы. `base: td` — ячейка таблицы. `base: hr` — линия. `base: input` — поле ввода. `base: textarea` — многострочное поле. `base: select` — выпадающий список. `base: label` — метка. `base: form` — форма. `base: header` — шапка. `base: footer` — подвал. `base: section` — секция. `base: article` — статья. `base: nav` — навигация. `base: strong` — жирный. `base: em` — курсив. `base: mark` — выделенный. `base: small` — маленький.

## Авто-размеры
Динамически задают размеры. Работают вместе с `base:`. `auto: h1 3rem` `auto: h2 2rem` `auto: h3 1.5rem` `auto: h4 1.2rem` `auto: h5 1rem` `auto: h6 0.8rem` `auto: p 1rem` `auto: a 1rem` `auto: img 300px` `auto: button 0.9rem` `auto: li 1rem` `auto: blockquote 1rem` `auto: code 0.85em` `auto: input 1rem`. Можно передавать любые значения: `px`, `rem`, `em`, `%`, `clamp()`.

## Вывод в консоль
`prinln текст` — вывод в консоль. `println: err текст` — вывод ошибки.

## Пример .izet файла
avatar: center bleck
base: h1
auto: h1 4rem
base: h2
auto: h2 2.5rem
base: p
auto: p 1.1rem
base: a
base: button
auto: button 1rem
base: img
auto: img 500px
base: ul
base: li
base: blockquote
base: code
base: input
auto: input 1rem
prinln Build complete!

text

## Структура проекта
`Main.java` — точка входа, парсинг. `Lexer.java` — темы black/white. `Parser.java` — стили тегов + аватары. `Auto.java` — динамические размеры. `Ut.java` — утилиты вывода.

## Почему izetFF
Пишешь на своём языке. Получаешь готовый CSS. Быстро. Стильно. Твоё.