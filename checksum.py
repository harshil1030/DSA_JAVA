def checkSum(segments, mbit):
    # First word
    ans = int(segments[0],2)
    # Converting to int and adding 2-to-all words
    for i in range(1,len(segments)):
        ans +=int(segments[i],2)
    # Binary form of ans
    b = bin(ans)
    k = len(b)
    rtr =""
    # Check if any carry bit is generated or not
    if k>mbit+2:
        ans = int(b[k-mbit:],2) + int(b[0:k-mbit],2)
        ans = bin(ans)[2:].zfill(mbit)
    else:
        ans = b[2:].zfill(mbit)
        
    # Sum -> CheckSum
    for i in range(mbit):
        if ans[i]=="0":
            rtr+="1"
        else:
            rtr+="0"
    return rtr
print("Conclusion: ", checkSum(["10011001","11100010","00100100","10000100",checkSum(["10011001","11100010","00100100","10000100"],8)],8))
