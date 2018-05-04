//Possible Extensions: Famous People, Fantasy, Chemistry Elements, TV Shows/Movies, CS References
public class Normal{
	/**variables**/
	//initializing classes
	private Key key = new Key();
	
	//all elements
	private Element fire = new Element("fire");
	private Element water = new Element("water");
	private Element earth = new Element("earth");
	private Element air = new Element("air");
	private Element steam = new Element("steam");
	private Element smoke = new Element("smoke");
	
	private Element lava = new Element("lava");  //starts next "round"
	private Element swamp = new Element("swamp");
	private Element cloud = new Element("cloud");
	private Element smog = new Element("smog");
	private Element pressure = new Element("pressure");
	private Element lake = new Element("lake");
	
	private Element stone = new Element("stone");  //starts next "round"
	private Element life = new Element("life");
	private Element storm = new Element("storm");
	private Element energy = new Element("energy");
	private Element sea = new Element("sea");
	
	private Element volcano = new Element("volcano");  //starts next "round"
	private Element metal = new Element("metal");
	private Element pebble = new Element("pebble");
	private Element coal = new Element("coal");
	private Element boulder = new Element("boulder");
	
	private Element lightning = new Element("lightning");  //starts next "round"
	//private Element plankton = new Element("plankton");
	private Element plant = new Element("plant");
	private Element fish = new Element("fish");
	private Element egg = new Element("egg");
	
	private Element current = new Element("current");  //starts next "round"
	private Element earthquake = new Element("earthquake");
	private Element time = new Element("time");
	private Element ocean = new Element("ocean");
	private Element beach = new Element("beach");
	
	private Element sand = new Element("sand");  //starts next "round"
	private Element wind = new Element("wind");
	private Element heat = new Element("heat");
	private Element rust = new Element("rust");
	private Element steamEngine = new Element("steam engine");
	
	private Element robot = new Element("robot");  //starts next "round"
	private Element diamond = new Element("diamond");
	private Element ash = new Element("ash");
	private Element seaweed = new Element("seaweed");
	private Element tree = new Element("tree");
	
	private Element flyingFish = new Element("flying fish");  //starts next "round"
	private Element bird = new Element("bird");
	private Element friedEgg = new Element("fried egg");
	private Element lizard = new Element("lizard");
	private Element electricity = new Element("electricity");
	
	private Element waves = new Element("waves");  //starts next "round"
	private Element tsunami = new Element("tsunami");
	private Element hurricane = new Element("hurricane");
	private Element death = new Element("death");
	private Element planet = new Element("planet");
	
	private Element island = new Element("island");  //starts next "round"
	private Element glass = new Element("glass");
	private Element salt = new Element("salt");
	private Element rock = new Element("rock");
	private Element desert = new Element("desert");
	
	private Element oasis = new Element("oasis");  //starts next "round"
	private Element sandstorm = new Element("sandstorm");
	private Element seagull = new Element("seagull");
	private Element ostrich = new Element("ostrich");
	private Element duck = new Element("duck");
	private Element computer = new Element("computer");
	private Element camel = new Element("camel");
	private Element internet = new Element("internet");
	private Element mug = new Element("mug");
	private Element ring = new Element("ring");
	
	private Element bee = new Element("bee");  //starts next "round"
	private Element airplane = new Element("airplane");
	private Element forest = new Element("forest");
	private Element sun = new Element("sun");
	private Element solarPanel = new Element("solar panel");
	private Element star = new Element("star");
	private Element galaxy = new Element("galaxy");
	private Element universe = new Element("universe");
	
	private Element telescope = new Element("telescope");  //starts next "round"
	private Element spaceship = new Element("spaceship");
	private Element Mars = new Element("Mars");
	private Element moon = new Element("moon");
	private Element animal = new Element("animal");
	private Element deer = new Element("deer");
	private Element eel = new Element("eel");
	private Element alligator = new Element("alligator");

	private Element crab = new Element("crab");  //starts next "round"
	private Element whale = new Element("whale");
	private Element monkey = new Element("monkey");
	private Element golem = new Element("golem");
	private Element human = new Element("human");
	private Element biologist = new Element("biologist");
	private Element programmer = new Element("programmer");
	private Element socialMedia = new Element("social media");
	
	private Element friend = new Element("friend");  //starts next "round"
	private Element pilot = new Element("pilot");
	private Element astronomer = new Element("astronomer");
	private Element astronaut = new Element("astronaut");
	private Element hunter = new Element("hunter");
	private Element tool = new Element("tool");
	private Element eclipse = new Element("eclipse");
	private Element torch = new Element("torch");
	
	private Element surfboard = new Element("surfboard");  //starts next "round"
	private Element grave = new Element("grave");
	private Element irrigation = new Element("irrigation");
	private Element battery = new Element("battery");
	private Element worldWideWeb = new Element("world wide web");
	private Element Google = new Element("Google");
	private Element hourGlass = new Element("hourGlass");
	private Element watch = new Element("watch");

	private Element lightningRod = new Element("lightning rod");  //starts next "round"
	private Element boat = new Element("boat");
	private Element pirateShip = new Element("pirate ship");
	private Element pirate = new Element("pirate");
	private Element treasure = new Element("treasure");
	private Element sword = new Element("sword");
	private Element axe = new Element("axe");
	private Element phone = new Element("phone");
	
	private Element domestication = new Element("domestication");  //starts next "round"
	private Element field = new Element("field");
	private Element flower = new Element("flower");
	private Element farmer = new Element("farmer");
	private Element tractor = new Element("tractor");
	private Element sunflower = new Element("sunflower");
	private Element crops = new Element("crops");
	private Element knight = new Element("knight");
	
	private Element knife = new Element("knife");  //starts next "round"
	private Element chef = new Element("chef");
	private Element king = new Element("king");
	private Element wood = new Element("wood");
	private Element raft = new Element("raft");
	private Element campFire = new Element("camp fire");
	private Element war = new Element("war");
	private Element crown = new Element("crown");
	
	private Element banana = new Element("banana");  //starts next "round"
	private Element shield = new Element("shield");
	private Element weapon = new Element("weapon");
	private Element cattle = new Element("cattle");
	private Element crow = new Element("crow");
	private Element food = new Element("food");
	private Element paper = new Element("paper");
	private Element origami = new Element("origami");
	
	private Element sculpture = new Element("sculpture");  //starts next "round"
	private Element sheep = new Element("sheep");
	private Element sattle = new Element("sattle");
	private Element dirt = new Element("dirt");
	private Element mud = new Element("mud");
	private Element pig = new Element("pig");
	private Element mountain = new Element("mountain");
	private Element goat = new Element("goat");
	
	private Element milk = new Element("milk");  //starts next "round"
	private Element cow = new Element("cow");
	private Element steak = new Element("steak");
	private Element bacon = new Element("bacon");
	private Element ham = new Element("ham");
	private Element house = new Element("house");
	private Element hut = new Element("hut");
	private Element cabin = new Element("cabin");
	
	private Element paperAirplane = new Element("paper airplane");  //starts next "round"
	private Element chimney = new Element("chimney");
	private Element treeHouse = new Element("treeHouse");
	private Element hanger = new Element("hanger");
	private Element horse = new Element("horse");
	private Element seaHorse = new Element("seaHorse");
	private Element barn = new Element("barn");
	private Element shears = new Element("shears");
	private Element artist = new Element("artist");
	
	private Element graphicDesign = new Element("graphic design");  //starts next "round"
	private Element book = new Element("book");
	private Element bookmark = new Element("bookmark");
	private Element scholar = new Element("scholar");
	private Element pencil = new Element("pencil");
	private Element author = new Element("author");
	private Element paintBrush = new Element("paint brush");
	private Element chalk = new Element("chalk");
	private Element painting = new Element("painting");
	
	private Element drawing = new Element("drawing");  //starts next "round"
	private Element map = new Element("map");
	private Element treasureMap = new Element("treasure map");
	private Element wool = new Element("wool");
	private Element clay = new Element("clay");
	private Element needle = new Element("needle");
	private Element brick = new Element("brick");
	private Element castle = new Element("castle");
	private Element moat = new Element("moat");
	
	private Element clothes = new Element("clothes");  //starts next "round"
	private Element armor = new Element("armor");
	private Element swimsuit = new Element("swimsuit");
	private Element wall = new Element("wall");
	private Element firewall = new Element("firewall");
	private Element fence = new Element("fence");
	private Element library = new Element("library");
	
	//list of all elements
	private Element[] elements = {fire, water, earth, air, steam, smoke, lava, swamp, cloud, 
				smog, pressure, lake, stone, life, storm, energy, sea, volcano, metal, pebble, 
				coal, boulder, lightning, plant, fish, egg, current, earthquake, time, ocean, 
				beach, sand, wind, heat, rust, steamEngine, robot, diamond, ash, seaweed, tree,
				flyingFish, bird, friedEgg, lizard, electricity, waves, tsunami, hurricane, death, 
				planet, island, glass, salt, rock, desert, oasis, sandstorm, seagull, ostrich, 
				duck, computer, camel, internet, mug, ring, bee, airplane, forest, sun, solarPanel, 
				star, galaxy, universe, telescope, spaceship, Mars, moon, animal, deer, eel, 
				alligator, crab, whale, monkey, golem, human, tool, eclipse, torch, surfboard, 
				grave, irrigation, battery, worldWideWeb, Google, hourGlass, watch, lightningRod, 
				boat, pirateShip, pirate, treasure, sword, axe, phone, domestication, field, flower, 
				farmer, tractor, sunflower, crops, knight, knife, chef, king, wood, raft, campFire, 
				war, crown, banana, shield, weapon, cattle, crow, food, paper, origami,  sculpture, 
				sheep, sattle, dirt, mud, pig, mountain, goat, milk, cow, steak, bacon, ham, house, 
				hut, cabin, paperAirplane, chimney, treeHouse, hanger, horse, seaHorse, barn, shears, 
				artist, graphicDesign, book, bookmark, scholar, pencil, author, paintBrush, chalk,
				painting, drawing, map, treasureMap, wool, clay, needle, brick, castle, moat,
				clothes, armor, swimsuit, wall, firewall, fence, library, biologist, programmer, socialMedia,
				friend, pilot, astronomer, astronaut, hunter};
	
	
	/**constructor**/
	public Normal()
	{
		setCombos();
	}
	
	/**Methods**/
	//sets up the combos
	public void setCombos()
	{
		key.addCombo(fire, water, steam);
		key.addCombo(fire, earth, volcano);
		key.addCombo(water, earth, swamp);
		key.addCombo(water, air, cloud);
		key.addCombo(air, smoke, smog);
		key.addCombo(earth, air, pressure);
		key.addCombo(water, water, lake);
		key.addCombo(lava, water, stone);
		key.addCombo(swamp, energy, life);
		key.addCombo(cloud, water, storm);
		key.addCombo(cloud, smoke, smog);
		key.addCombo(pressure, earth, energy);
		key.addCombo(lake, water, sea);
		key.addCombo(stone, fire, metal);
		key.addCombo(stone, water, pebble);
		key.addCombo(stone, earth, coal);
		key.addCombo(stone, pressure, pebble);
		key.addCombo(stone, stone, boulder);
		key.addCombo(life, water, plant);
		key.addCombo(life, earth, animal);
		key.addCombo(life, lake, fish);
		key.addCombo(life, stone, egg);
		key.addCombo(storm, energy, lightning);
		key.addCombo(energy, water, current);
		key.addCombo(energy, earth, earthquake);
		key.addCombo(energy, pressure, time);
		key.addCombo(sea, water, ocean);
		key.addCombo(sea, earth, beach);
		key.addCombo(sea, stone, sand);
		key.addCombo(air, pressure, wind);
		key.addCombo(volcano, time, lava);
		
		key.addCombo(metal, fire, heat);
		key.addCombo(metal, water, rust);
		key.addCombo(metal, steam, steamEngine);
		key.addCombo(metal, life, robot);
		key.addCombo(coal, fire, energy);
		key.addCombo(coal, pressure, diamond);
		
		key.addCombo(plant, fire, ash);
		key.addCombo(plant, lake, seaweed);
		key.addCombo(plant, earth, tree);
		key.addCombo(fish, air, flyingFish);
		key.addCombo(egg, life, bird);
		key.addCombo(egg, fire, friedEgg);
		key.addCombo(egg, earth, lizard);
		key.addCombo(lightning, energy, electricity);
		
		key.addCombo(current, water, energy);
		key.addCombo(current, ocean, waves);
		key.addCombo(earthquake, ocean, tsunami);
		key.addCombo(storm, wind, hurricane);
		key.addCombo(time, life, death);
		key.addCombo(time, egg, bird);
		key.addCombo(ocean, earth, planet);
		key.addCombo(stone, ocean, sand);
		key.addCombo(ocean, life, fish);
		key.addCombo(ocean, volcano, island);
		
		key.addCombo(sand, fire, glass);
		key.addCombo(sand, pressure, rock);
		key.addCombo(sand, life, golem);
		key.addCombo(sand, ocean, beach);
		key.addCombo(sand, sand, desert);
		key.addCombo(heat, energy, sun);
		
		key.addCombo(tree, fire, ash);
		key.addCombo(tree, tree, forest);
		
		key.addCombo(bird, water, duck);
		key.addCombo(bird, earth, ostrich);
		key.addCombo(bird, plant, bee);
		key.addCombo(bird, fish, flyingFish);
		key.addCombo(bird, egg, bird);
		key.addCombo(bird, beach, seagull);
		key.addCombo(electricity, metal, computer);
		key.addCombo(lightning, tree, fire);
		
		key.addCombo(glass, water, mug);
		key.addCombo(air, metal, airplane);
		key.addCombo(metal, diamond, ring);
		key.addCombo(rock, wind, stone);
		key.addCombo(rock, water, stone);
		key.addCombo(desert, wind, sandstorm);
		key.addCombo(desert, water, oasis);
		key.addCombo(desert, animal, camel);
		key.addCombo(desert, storm, sandstorm);
		
		key.addCombo(computer, computer, internet);
		key.addCombo(airplane, life, bird);
		key.addCombo(sun, energy, heat);
		key.addCombo(sun, metal, solarPanel);
		key.addCombo(sun, plant, energy);
		key.addCombo(sun, sun, star);
		
		key.addCombo(star, planet, galaxy);
		key.addCombo(galaxy, galaxy, universe);
		key.addCombo(galaxy, metal, telescope);
		key.addCombo(airplane, galaxy, spaceship);
		key.addCombo(spaceship, planet, Mars);
		key.addCombo(planet, rock, moon);
		
		key.addCombo(animal, water, fish);
		key.addCombo(animal, air, bird);
		key.addCombo(animal, swamp, alligator);
		key.addCombo(animal, beach, crab);
		key.addCombo(animal, ocean, whale);
		key.addCombo(animal, tree, monkey);
		key.addCombo(animal, electricity, eel);
		key.addCombo(animal, forest, deer);
		
		key.addCombo(golem, life, human);
		key.addCombo(golem, animal, human);
		key.addCombo(human, fire, ash);
		key.addCombo(human, metal, tool);
		key.addCombo(human, plant, biologist);
		key.addCombo(human, computer, programmer);
		key.addCombo(human, internet, socialMedia);
		key.addCombo(human, human, friend);
		key.addCombo(human, airplane, pilot);
		key.addCombo(human, telescope, astronomer);
		key.addCombo(human, spaceship, astronaut);
		key.addCombo(human, deer, hunter);
		
		key.addCombo(tool, fire, torch);
		key.addCombo(tool, water, irrigation);
		key.addCombo(tool, air, airplane);
		key.addCombo(tool, energy, battery);
		key.addCombo(tool, sea, boat);
		key.addCombo(tool, ocean, boat);
		key.addCombo(tool, metal, sword);
		key.addCombo(tool, lightning, lightningRod);
		key.addCombo(tool, time, watch);
		key.addCombo(tool, sand, hourGlass);
		key.addCombo(tool, tree, axe);
		key.addCombo(tool, electricity, battery);
		key.addCombo(tool, waves, surfboard);
		key.addCombo(tool, death, grave);
		key.addCombo(tool, computer, phone);
		key.addCombo(tool, internet, worldWideWeb);
		key.addCombo(tool, sun, solarPanel);
		key.addCombo(tool, star, telescope);
		key.addCombo(tool, galaxy, spaceship);
		key.addCombo(tool, animal, domestication);
		key.addCombo(tool, programmer, eclipse);
		
		key.addCombo(irrigation, earth, field);
		key.addCombo(field, plant, flower);
		key.addCombo(worldWideWeb, tool, Google);
		key.addCombo(boat, human, pirateShip);
		key.addCombo(pirateShip, human, pirate);
		key.addCombo(crops, human, farmer);
		key.addCombo(field, human, farmer);
		key.addCombo(farmer, field, crops);
		key.addCombo(pirate, metal, treasure);
		
		key.addCombo(boat, air, airplane);
		key.addCombo(sword, human, knight);
		key.addCombo(sword, tool, knife);
		key.addCombo(sword, stone, king);
		key.addCombo(axe, tree, wood);
		key.addCombo(axe, forest, wood);
		key.addCombo(domestication, plant, crops);
		key.addCombo(flower, sun, sunflower);
		key.addCombo(farmer, animal, cattle);
		key.addCombo(domestication, animal, cattle);
		key.addCombo(farmer, forest, field);
		key.addCombo(tool, farmer, tractor);
		
		key.addCombo(crops, tree, banana);
		key.addCombo(bird, crops, crow);
		key.addCombo(knight, tool, shield);
		key.addCombo(knife, human, chef);
		key.addCombo(chef, crops, food);
		
		key.addCombo(king, metal, crown);
		key.addCombo(king, death, war);
		key.addCombo(wood, fire, campFire);
		key.addCombo(wood, lake, raft);
		key.addCombo(wood, boat, raft);
		key.addCombo(wood, sea, raft);
		key.addCombo(life, wood, tree);
		key.addCombo(wood, tool, paper);
		key.addCombo(war, human, death);
		key.addCombo(war, tool, weapon);
		
		key.addCombo(cattle, field, sheep);
		key.addCombo(earth, earth, dirt);
		key.addCombo(dirt, water, mud);
		key.addCombo(mud, cattle, pig);
		key.addCombo(earth, cloud, mountain);
		key.addCombo(mountain, cattle, goat);
		key.addCombo(cow, farmer, milk);
		key.addCombo(pig, fire, bacon);
		key.addCombo(pig, sword, ham);
		key.addCombo(wood, human, house);
		key.addCombo(house, smoke, chimney);
		key.addCombo(farmer, house, barn);
		key.addCombo(barn, cattle, horse);
		key.addCombo(horse, tool, sattle);
		key.addCombo(farmer, domestication, cow);
		
		key.addCombo(paper, paper, book);
		key.addCombo(paper, tool, pencil);
		key.addCombo(paper, pencil, drawing);
		key.addCombo(paper, human, drawing);
		key.addCombo(drawing, human, artist);
		key.addCombo(artist, tool, paintBrush);
		key.addCombo(artist, paper, drawing);
		key.addCombo(artist, glass, sculpture);
		key.addCombo(paper, air, paperAirplane);
		key.addCombo(paper, airplane, paperAirplane);
		key.addCombo(paper, bird, paperAirplane);
		key.addCombo(paper, planet, map);
		key.addCombo(paper, galaxy, map);
		key.addCombo(paper, animal, origami);
		key.addCombo(sheep, tool, shears);
		key.addCombo(sheep, shears, wool);
		key.addCombo(mud, fire, clay);
		key.addCombo(dirt, beach, sand);
		key.addCombo(cow, sword, steak);
		key.addCombo(cow, fire, steak);
		
		key.addCombo(house, water, boat);
		key.addCombo(house, earth, hut);
		key.addCombo(house, lake, cabin);
		key.addCombo(house, wood, cabin);
		key.addCombo(house, stone, castle);
		key.addCombo(house, tree, treeHouse);
		key.addCombo(house, airplane, hanger);
		key.addCombo(house, forest, treeHouse);
		key.addCombo(house, pirate, pirateShip);
		key.addCombo(house, king, castle);
		key.addCombo(house, cattle, barn);
		key.addCombo(house, mud, hut);
		key.addCombo(house, hunter, cabin);
		
		key.addCombo(horse, sea, seaHorse);
		key.addCombo(artist, computer, graphicDesign);
		key.addCombo(book, tool, bookmark);
		key.addCombo(book, human, author);
		key.addCombo(pencil, water, paintBrush);
		key.addCombo(pencil, earth, chalk);
		key.addCombo(paintBrush, human, artist);
		key.addCombo(chalk, human, artist);
		key.addCombo(chalk, paper, drawing);
		key.addCombo(paintBrush, paper, painting);
		key.addCombo(author, paper, book);
		key.addCombo(author, computer, book);
		
		key.addCombo(map, pirate, treasureMap);
		key.addCombo(map, treasure, treasureMap);
		key.addCombo(wool, tool, needle);
		key.addCombo(wool, human, clothes);
		key.addCombo(clay, fire, brick);
		key.addCombo(brick, brick, wall);
		key.addCombo(wall, wall, house);
		key.addCombo(artist, clay, sculpture);
		key.addCombo(castle, human, king);
		key.addCombo(water, castle, moat);
		key.addCombo(clothes, water, swimsuit);
		key.addCombo(clothes, lake, swimsuit);
		key.addCombo(clothes, sea, swimsuit);
		key.addCombo(clothes, ocean, swimsuit);
		key.addCombo(clothes, metal, armor);
		key.addCombo(armor, human, knight);
		key.addCombo(clothes, shield, knight);
		key.addCombo(wall, house, fence);
		key.addCombo(wall, airplane, hanger);
		key.addCombo(wall, human, house);
		key.addCombo(wall, flower, fence);
		key.addCombo(book, house, library);
		key.addCombo(wall, cattle, fence);
		key.addCombo(wall, computer, firewall);
		
		//round 2 additions
		key.addCombo(plant, sea, seaweed);
		key.addCombo(metal, bird, airplane);
		key.addCombo(fire, air, smoke);
		
	}
	
	public Element[] getElements()
	{
		return elements;
	}
	
	public boolean isCombo(Element e1, Element e2)
	{
		return key.isCombo(e1, e2);
	}
	
	public int[] makeList()
	{
		int[] list = new int[elements.length];
		for(int i = 0; i < list.length; i++)
		{
			list[i] = key.canMake(elements[i]);
		}
		return list;
	}

	public int indexOf(Element e)
	{
		for(int i = 0; i < elements.length; i++){
			if(elements[i].equals(e))
				return i;
		}
		return -1;
	}
	
	public Element becomes(Element e1, Element e2)
	{
		return key.becomes(e1, e2);
	}
}
