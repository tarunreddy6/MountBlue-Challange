// Breaking the Records 
// Happy Coding:)
  
def breakingRecords(scores):
    # Write your code here
    low = scores[0]
    high = scores[0]
    min = 0
    max = 0
    for i in range(1,len(scores)):
        if scores[i] < low:
            min = min + 1
            low = scores[i]
        if scores[i] > high:
            max += 1
            high = scores[i]
    return [max, min]    
