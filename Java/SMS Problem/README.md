Background Story(Recalled from memory):

You want to send SMS.
But SMS too long, so yeah need to divide message to separate SMS.

Rules + Goals:

1. Make function

int solution(String S, int K)

Where S is the full SMS Message like "sample text message please"
Where K is the maximum string length per SMS message

2. Function Result
Must return number of minimum possible SMS needed to send. 
-1 if not possible to divide.

ex

solution("sample text message please", 6)
returns 4


ETC:

Must not divide words. words must be full.
Message is always separated 1 space apart. No leading and trailing space on full SMS.
