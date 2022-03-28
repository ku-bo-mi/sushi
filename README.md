# Sushi Project
Welcome to Sushi project!

Sushi project is a management system for a virtual sushi restaurant.

## What does this program do?
- Reads food / drink menu from menu.txt file and creates FoodCatalog class.
- Reads customer's orders from order.txt file and creates Order class.
- Creates a Table class and prints ordered food / drink in the console.
- Prints the bill of the Table with detail information, such as table number, total bill, tax, and total calories.

## Sample Output
Here is a sample output of this project

```
------ メニュー ------
日本酒	700円
いか	110円
まぐろ	220円
あがり	400円
えび	110円
ビール	600円
----------------------

へい、おまち！
テーブル番号:	1 番
🍺  🍺  🐟  🦑  🦑  🦐  🍶  🦑  🐟  🐟  🍵  🍵

ご利用ありがとうございました。
-------- 伝票 --------
2022/03/28 14:25
テーブル番号:	1 番
人数:		2 名
ご注文品数	12 品
小計:		3800 円
消費税:		380 円
合計:		4180 円
総カロリー:	1690 kCal
----------------------
```