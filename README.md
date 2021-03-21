This app can unpack strings like 'number[string]'.

For example: 

3[xyz]4[xy]z --> xyzxyzxyzxyxyxyxyz

Restrictions: 

    - one repetition may contain another: 2[3[x]y] --> xxxyxxxy
    - allowed input characters: latin letters, numbers and brackets []
    - numbers only mean the number of repetitions
    - brackets only to indicate repeated substrings
    - the input string is always valid
