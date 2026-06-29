# izetFF

Собственный транспайлер на Java. Превращает простой текстовый синтаксис в готовый CSS файл с поддержкой тем, позиционирования, динамических размеров и переменных.

## Установка

Требования: JDK 17+. Компиляция: `javac org/example/*.java`. Алиас: `alias izetFF='java org.example.Main'`. Запуск: `izetFF input.izet output.css`.

После установки алиаса проверь версию: `izetFF --version`.

## Синтаксис

izetFF читает `.izet` файл построчно и выполняет команды.

## Переменные

`let имя=значение` — объявляет переменную. Можно использовать в `auto`, `println`, `println: err`. Пример:
let title_size=4rem
let text_size=1.2rem
auto: h1 title_size
auto: p text_size

text

## Темы

`base css black` — чёрная тема. `base css white` — белая тема. Подключают глобальные CSS-переменные и стили.

## Аватары

Используются вместо `base css`. Подключают готовую тему с полным CSS и заданным выравниванием.

`avatar: left bleck` — чёрная, влево. `avatar: left white` — белая, влево. `avatar: center bleck` — чёрная, по центру. `avatar: center white` — белая, по центру.

## Базовые стили тегов

Подключают готовые CSS-стили для HTML-тегов. Все команды: `base: h1`, `base: h2`, `base: h3`, `base: h4`, `base: h5`, `base: h6`, `base: p`, `base: a`, `base: button`, `base: img`, `base: ul`, `base: ol`, `base: li`, `base: blockquote`, `base: code`, `base: pre`, `base: table`, `base: th`, `base: td`, `base: hr`, `base: input`, `base: textarea`, `base: select`, `base: label`, `base: form`, `base: header`, `base: footer`, `base: section`, `base: article`, `base: nav`, `base: strong`, `base: em`, `base: mark`, `base: small`.

## Авто-размеры

Динамически задают размеры тегов. Работают вместе с `base:`. Поддерживают переменные.

Команды: `auto: h1 3rem`, `auto: h2 2rem`, `auto: h3 1.5rem`, `auto: h4 1.2rem`, `auto: h5 1rem`, `auto: h6 0.8rem`, `auto: p 1rem`, `auto: a 1rem`, `auto: img 300px`, `auto: button 0.9rem`, `auto: li 1rem`, `auto: blockquote 1rem`, `auto: code 0.85em`, `auto: input 1rem`. Можно передавать любые значения: `px`, `rem`, `em`, `%`, `clamp()`.

С переменной: `let mySize=2rem` затем `auto: h1 mySize`.

## Вывод в консоль

`println текст` — вывод в консоль. `println: err текст` — вывод ошибки. Поддерживают переменные: `let msg=Hello` затем `println msg`.

## Система команд

`help` — показывает список всех доступных команд. Новые команды добавляются в `CommandLogicLexer.java`.

## Подсказки в izetff
Подсказки пишутся через `/1`
пример: `
/1 создания переменной
let name = Karen
/1 выводим
println name`
## Полный пример .izet файла
let h_size=4rem
let p_size=1.1rem
avatar: center bleck
base: h1
auto: h1 h_size
base: h2
auto: h2 2.5rem
base: p
auto: p p_size
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
println Build complete!

Запуск: `izetFF style.izet output.css`

Подключение в HTML: `<link rel="stylesheet" href="output.css">`

## Структура проекта

`Main.java` — точка входа, парсинг, переменные. `CommandLogicLexer.java` — обработчик команд. `Lexer.java` — темы black/white. `Parser.java` — стили тегов + аватары. `Auto.java` — динамические размеры. `Ut.java` — утилиты вывода.

## Почему izetFF

Пишешь на своём языке. Получаешь готовый CSS. Переменные. Темы. Быстро. Стильно. Твоё.