# C'EST DU BRUTAL

Le jeu C’est du brutal ! se joue à deux joueurs et a pour décor l’université de technologie de Montauban. Chaque joueur représente un des sept programmes de l’UTM (ISI, RT, A2I, GI, GM, MTE, MM) et possède un effectif de 20 étudiants. A l’aide de son équipe, chaque joueur devra essayer de contrôler une majorité de zones d’influence.

**_Ces zones d’influence sont_**

1. La bibliothèque;
2. Le Bureau des Etudiants;
3. Le Quartier Administratif;
4. Les Halles industrielles;
5. La Halle Sportive;

**_Chaque étudiant possède les caractéristiques suivantes :_**

- **Crédits ECTS :** ce nombre de crédits est initialement de 30. Lorsque la valeur atteint 0 ou moins, l’étudiant sort définitivement de la bataille;
- **Dextérité :** la dextérité initialement affectée à 0 est comprise entre 0 et 10. Elle augmente les chances de "toucher" son adversaire en lançant son gobelet (dit le gobi) lors d’une attaque, ou d’esquiver lorsqu’il est attaqué. Un point correspond à 3% de chance supplémentaire d’atteindre sa cible ou d’esquiver une attaque. La dextérité sert également à la réussite d’un soin porté à un frère d’arme. Un point correspond à 6% de chance supplémentaire de réussir le soin;
- **Force :** la force initialement affectée à 0 est comprise entre 0 et 10. Elle augmente les dégâts que peut infliger un étudiant à son adversaire de 10% par point affecté. Ainsi, un étudiant avec une force de 2 “frappera" avec 20% de force en plus. Il fera 20% de dégâts en plus;
- **Résistance :** la résistance initialement affectée à 0 est comprise entre 0 et 10. Elle permet de diminuer les dégâts reçus de 5% par point affecté. Ainsi, un étudiant avec une résistance de 2 "absorbera" 10% des dégâts infligés;
- **Constitution :** la constitution initialement à 0 est comprise entre 0 et 30. Elle permet d’augmenter la constitution d’un étudiant en lui donnant des crédits ECTS supplémentaires. Ainsi, 10 points de constitution font augmenter les crédits ECTS initiaux à 40 (au lieu de 30);
- **Initiative :** l’initiative initialement affectée à 0 est comprise entre 0 et 10. Sur une zone de combat, l’étudiant qui a la plus forte initiative effectue son action, puis c’est au tour de l’étudiant qui a la seconde meilleure initiative etc… A titre d’exemple, les trois premiers étudiants à effectuer leur action peuvent
appartenir à la même équipe;
- **Stratégie :** Chaque étudiant possède une stratégie qui peut être défensive, offensive ou aléatoire;

**_Chaque étudiant possède les actions suivantes :_**

- **Soigner un combattant allié.** Cela consiste à choisir un allié sur la même zone de combat ayant le moins de crédits ECTS. Pour le soigné, le nombre de crédits gagnés dépend de la dextérité du soignant et de la constitution du soigné. Un tirage aléatoire permet de savoir si le soin est réussi. Soit 𝑥 ∈ [0,100] un nombre tiré aléatoirement. Si 𝑥 ∈ [0 , 20 + 6 ∗ 𝑑𝑒𝑥𝑡é𝑟𝑖𝑡é 𝑑𝑢 𝑠𝑜𝑖𝑔𝑛𝑎𝑛𝑡] alors le soin est réussi. Dans un tel cas, le soigné engrange 𝐸(𝑦 ∗ (10 + 𝑐𝑜𝑛𝑠𝑖𝑡𝑢𝑡𝑖𝑜𝑛 𝑑𝑢 𝑠𝑜𝑖𝑔𝑛é)) crédits ECTS avec 𝑦 ∈]0, 0.6] un nombre tiré aléatoirement et 𝐸(𝑧) la partie entière de 𝑧. Le gain obtenu ne peut en aucun cas dépasser la valeur (30 + 𝑐𝑜𝑛𝑠𝑡𝑖𝑡𝑢𝑡𝑖𝑜𝑛 𝑑𝑢 𝑠𝑜𝑖𝑔𝑛é);
- **Attaquer frontalement.** Sur sa zone de combat, l’étudiant lance son gobi à l’ennemi qui a le moins de crédits ECTS. Un tirage aléatoire permet de savoir si l’attaque est réussie. Soit 𝑥 ∈ [0,100] un nombre tiré aléatoirement. Si 𝑥 ∈ [0 , 40 + 3 ∗ 𝑑𝑒𝑥𝑡é𝑟𝑖𝑡é 𝑑𝑒 𝑙′𝑎𝑡𝑡𝑎𝑞𝑢𝑎𝑛𝑡] alors l’attaque est réussie. Dans un tel cas, l’attaqué perd 𝐸(𝑦 ∗ (1 + 𝑐𝑜𝑒𝑓𝑓𝑖𝑐𝑖𝑒𝑛𝑡 𝑑é𝑔â𝑡) ∗ 𝑑é𝑔â𝑡 𝑑𝑒 𝑟é𝑓é𝑟𝑒𝑛𝑐𝑒) crédits ECTS avec 𝑦 ∈]0, 1] un nombre tiré aléatoirement et 𝐸(𝑧) la partie entière de 𝑧. Le dégât de référence vaut 10 et 𝑐𝑜𝑒𝑓𝑓𝑖𝑐𝑖𝑒𝑛𝑡 𝑑é𝑔â𝑡 = max (0, min(100, 10 ∗ 𝑓𝑜𝑟𝑐𝑒 𝑑𝑒 𝑙′𝑎𝑡𝑡𝑎𝑞𝑢𝑎𝑛𝑡 − 5 ∗ 𝑟é𝑠𝑖𝑠𝑡𝑎𝑛𝑐𝑒 𝑑𝑒 𝑙′𝑎𝑡𝑡𝑎𝑞𝑢é));
- Soigner un partenaire constitue une stratégie défensive alors qu’attaquer frontalement est une stratégie offensive. Une stratégie aléatoire consiste pour un étudiant à évoluer d’une stratégie à une autre de manière aléatoire;

**_Les 20 protagonistes de chaque équipe sont hiérarchisés de la manière suivante :_**

- 15 étudiants avec les caractéristiques initiales présentées précédemment;
- 4 étudiants d’élite avec des caractéristiques initiales augmentées (Force +1, Dextérité +1, Résistance +1,
Constitution +5, Initiative +1);
- 1 Maitre du gobi avec des caractéristiques initiales augmentées (Force +2, Dextérité +2, Résistance +2,
Constitution +10, Initiative +2);

**_Etape 1 – Paramétrage des troupes._**
En début de partie, chaque joueur possède 400 points à distribuer à chacun de ses 20 combattants en les affectant aux caractéristiques Force, Dextérité, Résistance, Constitution, Initiative. Le joueur choisit également 5 combattants qui seront des réservistes (un réserviste peut être un étudiant, un étudiant d’élite ou le maître du gobi), les 15 autres se retrouveront donc sur le champ de bataille dès le début des hostilités. Cette étape est bien
entendue cachée pour l’adversaire. Chaque étudiant aura également une stratégie de combat.

**_Etape 2 – Affectation des troupes sur le champ de bataille._**
A cette étape, chaque joueur décide de répartir ses 15 combattants sur les 5 zones de combat. Il répartit à sa convenance ses troupes : il peut par exemple choisir de ne mettre qu’un seul combattant sur une zone (un sacrifice) et d’en mettre 5 sur une autre zone. Cette étape est bien entendue cachée pour l’adversaire.
Chaque joueur doit affecter au moins un combattant à chaque zone.

**_Etape 3 – Mêlée_**
La bataille est lancée et les 5 zones de combats font rage. Au fur et à mesure, les crédits ECTS des étudiants peuvent augmenter ou diminuer.

D’un point de vue algorithmique, les étudiants d’un champ de bataille sont stockés dans une liste selon la meilleure initiative. Le premier de la liste commet son action puis repasse à la fin de cette même liste.

Une mêlée s’achève avec le contrôle d’une des zones par un des joueurs (les adversaires ont été terrassés sur cette zone). Une trêve est donc déclarée et tous les combats sur les 5 zones sont arrêtés. Trêve pendant laquelle chaque joueur peut sournoisement faire certains mouvements de troupes à l’insu de son adversaire ; voir ci-après.

**_Etape 4 – Trêve & mouvements de troupes_**
A cette étape les 2 joueurs peuvent faire les actions suivantes de manière cachée :
- Affecter 1 ou plusieurs réservistes sur les zones de combats non contrôlées
- Si un joueur contrôle déjà une zone de combat, il peut redéployer ses combattant valides qui se trouvent sur cette zone vers d’autres zones de combats. Mais, un combattant doit rester sur la zone contrôlée pour maintenir l’ordre et l’influence du programme. Attention, un combattant qui est redéployé ne regagne pas de crédits ECTS. Il repart au combat avec ses blessures. Un combattant redéployé peut se voir attribuer une nouvelle stratégie.
- On ne peut pas redéployer de combattants d’une zone dont le combat n’est pas fini.
- Le joueur peut connaître le nombre de crédits ECTS par zone de combat.
 
**_Etape 5 – Cycle Mêlées – Trêves & mouvements de troupes_**
Les étapes 3 et 4 se répètent jusqu’à ce qu’un joueur contrôle au moins 3 zones et est donc déclaré vainqueur.
