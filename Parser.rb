#"publisher":{"id":"agltb3B1Yi1pbmNyEAsSB0FjY291bnQY2_3WEww","name":"Resignation Media"},"storeurl":"https://itunes.apple.com/us/app/thechive-probably-best-app/id448999087?mt=8&uo=4","ver":"1.9.6"}

datafile = File.open("SmallScrape.txt", "r")
lineage = datafile.readlines.to_s
datafile.close
lines = lineage.split(",")
doge = ["doge"]
arr = []
startnum = 0
endnum = 0
x=1
printnext = false
fname = "PublishersTest.txt"
writefile = File.open(fname, "w")
lines.each{ |line|  
    

    if printnext == true
    	writefile.puts line
    	printnext = false

    end
    
    if line.match('"publisher":{')
        writefile.print "Publisher: #{x} is"
        writefile.print line
        x = x+1
        printnext = true
    end
    

   
    }





