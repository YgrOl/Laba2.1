# Laba2.1
Software Reengineering
1. Винесення зчитування файлу в метод cleanText, 
що допомагає не викликати в методі cleanText і методі Main як це було.
Тепер зчитування в окремому методі CleanText

2. Прибирання конкатенації з коду так як такий споссіб сповільнює програму для великих текстів.
Використання Map< String, Integer що краще робить підрахунок слів.

3. Map.Entry для сортування і виведення слів з найбілшою частотою для кращох читабельності.

4. Розбивання коду на методи для кращої читаельності і підтриимки в майбутньому.
і одному методу належить одна дія.

5. Використання хеш-мапи замість вкладених циклів для підрахунку слів

6. Зміна назви змінних 

7. Видалення distinctString, замість цього Map<String, Integer> 
що дозволяє зберігати слова як ключ а частоту — як значення
Заміна на wordFrequencyMap, words, topN 
