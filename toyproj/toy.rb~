require 'java'
CONSTANTS = [PLUSHIE = 25.0,  BOOK = 15.0, BLOCKS = 20.0, CARD = 2.95, BALLOON = 6.0]
	 
class TOY
	@dollar = java.text.DecimalFormat.new("#,##0.00")
	def initialize(toy, cost, age)
    	stuff = [@toy=toy, @cost=cost, @age=age]
   	end

   	def setAge(age)
	   	@age = age if @age
	end

    def setCost(t)
	   	if (t.downcase == "plushie")
    		@cost = PLUSHIE
 		elsif (t.downcase == "book")
			@cost = BOOK
 		elsif (t.toLowerCase == "blocks")
 			@cost = BLOCKS
 		else
 			@cost = 0.0
 		end

    end

    def setToy(t)
		   	if (t.downcase == "plushie")
	         	@toy = "plushie"       	
	       	elsif (t.downcase == "book")
	     		@toy = "book"
	        elsif (t.downcase == "blocks")
	    		@toy = "blocks"	
	        else
	        	@toy = ""
	        end
    end

    def getAge
    	@age
    end

    def getToy
    	@toy
    end

    def getCost
    	@cost
    end

    def ageOK
    	(((@toy.to_s.downcase == "plushie") and ((0.0 <= @age.to_i) and (@age.to_i <= 2.0))) or ((@toy.to_s.downcase == "blocks") and ((3.0 <= @age.to_i) and (@age.to_i <=5.0))) or ((@toy.to_s.downcase == "book") or ((4.0 <= @age.to_i) and (@age.to_i <=7.0)))) ? bool = true : bool = false
    end

    def addCard(s)
	
	if(s.downcase == "yes")
		addCost(CARD)
	end
	end

	def addBalloon(s)

	if(s.downcase == "yes")
		addCost(BALLOON)
	end
	end
	
		
	def addCost(c)
	@cost += c;
	end
	
    def toString
    	return " Their age is: " + @age.to_s + " Their toy is: " + @toy + " $" + @cost.to_s
    end





end # end of toy class

class CHILD
	stuff = [@name, @toy,@card]

	def Name(name = nil)
		!name ? @name  : @name = name
	end

	def Toy(toy = nil)
		!toy ? @toy : @toy = toy
	end

	def card(card = nil)
		!card ? @card : @card = card
	end

	def strang
		return " the childs name is: " + @name.to_s + " They have a card message of: " + @card.to_s + " " + @toy.toString
	end
end

chunkymonkey = "penguins"
toyarr = []
kidarr = []
aye_aye_captain = []
x = 0
doubloons = 0
while (chunkymonkey != "yes") do
herp_the_derp = [toyarr[x] = TOY.new("",0,0), kidarr[x] = CHILD.new]

toyarr[x].setAge(javax.swing.JOptionPane.showInputDialog("ENTER THE AGE OF THIS CHILD"))
kidarr[x].Name(javax.swing.JOptionPane.showInputDialog("ENTER THE NAME OF THIS CHILD"))
toyarr[x].setToy(javax.swing.JOptionPane.showInputDialog("ENTER A TOY"))


chunky_bacon = toyarr[x].ageOK

if chunky_bacon == false 
	chunkier_bacon = (javax.swing.JOptionPane.showInputDialog("Would ya like to pick to a new toy? Type bacon to enter a new toy"))
	if chunkier_bacon.downcase == "bacon"
		chunkiest_bacon = "chunks"
		while chunkiest_bacon != "derp"
			toyarr[x].setToy(javax.swing.JOptionPane.showInputDialog("ENTER THE NAME OF UR TOY"))
			chunkiest_bacon = (javax.swing.JOptionPane.showInputDialog("ENTER DERP TO STOP"))
		end
	end
end

three_sixty_no_scope = (javax.swing.JOptionPane.showInputDialog("TYPE YES TO ADD A BALLOON"))
i_was_really_bored = (javax.swing.JOptionPane.showInputDialog("TYPE YES TO ADD A CARD"))

toyarr[x].addBalloon(three_sixty_no_scope)
toyarr[x].addCard(i_was_really_bored)


if i_was_really_bored.downcase == 'yes'
can_you_feel_it_mr_krabz = (javax.swing.JOptionPane.showInputDialog("TYPE A CARD MESSAGE"))
kidarr[x].card(can_you_feel_it_mr_krabz)
end

kidarr[x].Toy(toyarr[x])
aye_aye_captain << kidarr[x]
doubloons = doubloons + kidarr[x].Toy.getCost 

reply  = javax.swing.JOptionPane.showInputDialog("ENTER YES TO CONTINUE OR ANYTHING ELSE TO DIE")
(reply.downcase == "yes") ? chunkymonkey = "A PAINFUL END" : chunkymonkey = "yes"

end

puts "WHO LIVES IN A YELLOW PINEAPPLE UNDER THE SEA!?!?!"
aye_aye_captain.each {|matey| puts matey.strang}

puts "You spent this many doubloons MATEY"
puts doubloons

javax.swing.JOptionPane.showMessageDialog(nil, "WHO LIVES IN A YELLOW PINEAPPLE UNDER THE SEA!?!?!" )
aye_aye_captain.each {|matey| javax.swing.JOptionPane.showMessageDialog(nil, matey.strang)} 

javax.swing.JOptionPane.showMessageDialog(nil, "YOU SPENT THIS MANY DOUBLOONS" )
javax.swing.JOptionPane.showMessageDialog(nil, doubloons )



