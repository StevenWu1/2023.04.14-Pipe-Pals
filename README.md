# 2023.04.14-Pipe-Pals
Dory is communicating with Destiny through the pipes of the Marine Life Institute. She'd like to keep her message secret from any eavesdroppers, so she decides to use a simple encryption technique. She'll shift each letter in her message by a certain amount, and then Destiny will just reverse the shift to get the original message. Help Dory by writing a program that helps encrypt her message.

Skeleton: https://drive.google.com/file/d/0BxxolsFkwnDqWXdrbkdtbWdiNW8/view?usp=sharing

##### Input Format
First line will contain a single integer n, the amount to shift each letter by. Second line will contain a message to encrypt.

##### Constraints
0 <= n <= 1,000,000 0 <= message.length() <= 1,000

##### Output Format
The message after every alphabetic character (a to z and A to Z) is shifted by n places to the right, wrapping around the alphabet.

##### Sample Input 0
1
When life gets you down, you know what you gotta do? Just keep swimming.

##### Sample Output 0
Xifo mjgf hfut zpv epxo, zpv lopx xibu zpv hpuub ep? Kvtu lffq txjnnjoh.

##### Sample Input 1
10
DORY'S PARENT: "We see the undertow, and we say���"  DORY: "LET'S GO!"

##### Sample Output 1
NYBI'C ZKBOXD: "Go coo dro exnobdyg, kxn go cki���"  NYBI: "VOD'C QY!"
