Feature: Countries Capital

Scenario: Verify countries, capital and language
Given the user has countries array
|China|Egypt|France|Germany|India|Japan|Kenya|Mexico|United Kingdom|United States|
And the user has capitals array
|Beijing|Cario|Paris|Berlin|New Delhi|Tokyo|Nairobi|Mexico City|London|Washington D.C.|
And the user has languages array
|Chinese|Arabic|French|German|Hindi|Japanese|Swahili|Spanish|English|English|
When the user choose a random number 
Then the corresponding items should be printed