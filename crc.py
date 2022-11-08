def xor(n1, n2):
    ans = ""
    n2 = n2.zfill(len(n1))
    for i in range(len(n1)):
        if n1[i]!=n2[i]:
            ans +="1"
        else:
            ans +="0"
    return ans
    
def calSyndrome(data, divisor):
    lenDivis = len(divisor)
    lenCode = len(data)
    invData = ""
    for i in range(lenDivis):
        invData +="0"
    i = lenDivis
    codePart = data[:lenDivis]
    while i<=lenCode:
        if codePart[0]=="1":
            temp = xor(codePart, divisor)
        else:
            temp = xor(codePart, invData)
        if i!=lenCode:
            codePart = temp[1:] + data[i]
        else:
            codePart = temp
        i+=1
    return codePart[1:]
    
def senderCRC(data, divisor):
    lenDivis = len(divisor)
    codeWord = data
    # Add extra bits to generate CodeWord
    for i in range(lenDivis-1):
        codeWord+="0"
    # find remainder i.e syndrome
    syndrome = calSyndrome(codeWord, divisor)
    return xor(codeWord, syndrome)
    
def receiverCRC(data, divisor):
    return calSyndrome(data, divisor)
    
print("Sender:- ",senderCRC("1010000","1001"))
print("Receiver:- ", receiverCRC("1001110","1011"))
