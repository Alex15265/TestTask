This app can unpack strings like 'number[string]'.

For example: 

3[xyz]4[xy]z --> xyzxyzxyzxyxyxyxyz

Restrictions: 

    - one repetition may contain another: 2[3[x]y] --> xxxyxxxy
    - allowed input characters: latin letters, numbers and brackets []
    - numbers only mean the number of repetitions
    - brackets only to indicate repeated substrings
    - the input string is always valid

![UnpackedString](https://user-images.githubusercontent.com/70090712/111897615-fb5ae200-8a31-11eb-8fbd-c89ead32e3b1.png)

![UnpackedString1](https://user-images.githubusercontent.com/70090712/111897659-58569800-8a32-11eb-88a5-6265ce5f284b.png)

![InvalidString](https://user-images.githubusercontent.com/70090712/111897717-95228f00-8a32-11eb-9e73-b75f26d94b82.png)
