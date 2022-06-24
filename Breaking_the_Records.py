// Breaking the Records 
// Happy Coding:)
  
  def breakingRecords(scores):
    # Write your code here
    lo = scores[0]
    hi = scores[0]
    lob = 0
    hib = 0
    for i in range(1,len(scores)):
        if scores[i] < lo:
            lob += 1
            lo = scores[i]
        if scores[i] > hi:
            hib += 1
            hi = scores[i]
    return [hib, lob]
