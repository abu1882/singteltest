ReadME.md

Solution 1
	In Solution 1, there are 3 interfaces defined with methods walk, sing and fly respectivly. Both Animal and Bird classes implement these three interfaces
Solution 2
	in Solution 2, Duck and Chicken are added and they are of the type of Bird hierarchy.Though Chicken is of type Bird, its cannot fly as wings are broken. Strategy design pattern is used to implement to change the behaviour at run time 
Solution 3
	Rooster implements the talker interface and talks 'Cock-a-doodle-doo' with directly inherit from Chicken. Rooster is more flexible to maintain as it didnt directly inherit from Chicken
Solution 4
	Parrot is of special type of Bird which can talk like its neibour. Parrot implements talker interface has instance neibour class of type of talker. As Parrot is also talker, it talks same as its neibour
Solution 5
	Fish is another species which can Swim and cannot Sing or Walk. there are 2 special type of fishes implemented using direct inheritenace. Shark fish and Clown fish. Shark fish is bigger and grey and clown fish is smaller and in orange color. Shark fish has a special characteristics as it can crack jokes and Clown fish also has another special characteristics which eats other fishes
