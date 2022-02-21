# **Software Requirements Specification**

#
**## for**

# **Go Fish**

**Version 1.0 approved**

**Prepared by**  **Chandler Fletcher and Alexander Hannen**

**Western Illinois University**

**09/30/2021**

**Table of Contents**

**Table of Contents ii**

**Revision History ii**

**1. Introduction 1**

1.1 Purpose 1

1.2 Document Conventions 1

1.3 Intended Audience and Reading Suggestions 1

1.4 Project Scope 1

1.5 References 1

**2. Overall Description**  **2**

2.1 Product Perspective 2

2.2 Product Features 2

2.3 User Classes and Characteristics 3

2.4 Operating Environment 3

2.5 Design and Implementation Constraints 3

2.6 User Documentation 3

2.7 Assumptions and Dependencies 3

**3. System Features**  **3**

3.1 Start Game3

3.2 Play Instructions 4

3.3 Asking for a Card 4

3.4 Collecting Books 5

3.5 Winning the Game 6

3.6 Ending or Restarting the Game 6

**4. External Interface Requirements**  **6**

4.1 User Interfaces 6

4.2 Hardware Interfaces 7

4.3 Software Interfaces 7

4.4 Communications Interfaces 8

**5. Other Nonfunctional Requirements**  **8**

5.1 Performance Requirements 8

5.2 Safety Requirements 8

5.3 Security Requirements 8

5.4 Software Quality Attributes 8

**6. Other Requirements**  **8**

**Appendix A: Glossary**  **8**

**Appendix B: Analysis Models**  **9**

**Appendix C: Issues List**  **15**

**Revision History**

| **Name** | **Date** | **Reason For Changes** | **Version** |
| --- | --- | --- | --- |
| Hannen, Fletcher | 9/27/21 | Initial Copy | 1.0 |
| Hannen, Fletcher | 11/02/21 | Updated Analysis Models | 1.1 |
| Hanne, Fletcher | 12/04/21 | Updated Analysis Models and Table of Contents | 1.2 |

1.
# **Introduction**

  1.
## **Purpose**

_This document is for the card game Go Fish._

  1.
## **Document Conventions**

_The SRS conventions use 12 font size Italic Arial and 1.5 spacing. With 14 font size Bold Arial for section names. Heading names should have 18 font size Times size Bold. These conventions are used throughout the document. Google Doc was used to build this SRS._

  1.
## **Intended Audience and Reading Suggestions**

_The intended audience for this game is for the class, instructors, and anyone outside of class who may be interested. Those interested in playing the game should focus on section two, three and four. Those interested in how the game was created should read the entire document._

  1.
## **Project Scope**

_The software used for this project is JAVA using NETBeans as its development environment. The use of JAVA was due to this class assignment being primarily in JAVA which made sense to make it project using the JAVA programming language as well. NETBeans worked well because it worked great when it came to creating a GUI to go with the project._

  1.
## **References**

_As of right now, there are no references that this SRS refers to. This may be subjected to change._

1.
# **Overall Description**

  1.
## **Product Perspective**

_Go Fish is a traditional card game that we will reimplement with a computerized version._

  1.
## **Product Features**

_This game functions that will be summarized in the following:_

_Play:_

_Pressing play will start the game. Starting the game will shuffle a 52 card deck and hand out five cards to each player._

_Ask for a card:_

_When it&#39;s your turn, you&#39;ll be able to ask other players if they have a card that you already own. If they do, you will receive the card and receive another chance to ask for a card. If they do not, your turn will end and the game continues to the next player._

_How to play:_

_This function will give a description on how the game is played. Using this function is optional and is entirely up to the user._

_Go Fish:_

_This function will tell the player you do not have the card that they asked for. Using this function will end the opponent&#39;s current turn and move on to the next player._

_End game:_

_This will end the game early if you haven&#39;t completed the current game. Using this function will ask the player if they wish to start a new game._

  1.
## **User Classes and Characteristics**

_This game is intended for all ages. This language only functions in the english language, the programming language will primarily be JAVA._

  1.
## **Operating Environment**

_This game is designed to run on anything that can run JAVA._

  1.
## **Design and Implementation Constraints**

_This simple game should be run in JAVA 16.0.2. This game may not work on newer or older versions._

  1.
## **User Documentation**

_A user manual will be available on Go Fish._

  1.
## **Assumptions and Dependencies**

_There should be at least one user with one(or more) computer players._

1.
# **System Features**

  1.
## Start Game

3.1.1 Description and Priority

_This allows the user to start the game._

_Priority: High - initiates the game, required to set up the game_

3.1.2 Stimulus/Response Sequences

1. _The user presses the start game button on the gui to begin the game._
2. _Go fish begins, the player is dealt cards with the face values visible. The AI&#39;s hand(s) are face down but visible next to their respective names. a deck is visible in the center of the playspace, with a visible score for each player near their hands_

3.1.3 Functional Requirements

_REQ-1:_ _The user must press the start button._

_REQ-2:_ _Create AI players_

_REQ-3: Create the user class_

_REQ-4: Create the deck/shuffle them_

_REQ-5: Cards dealt to each player_

_REQ-6: 52 cards in play, seven in each hand if only two players_

  1.
## Play Instructions

3.2.1 Description and Priority

_This allows the user to read instructions for the game._

_Priority: Low - not necessary but useful for people unaware of the rules for the game_

3.2.2 Stimulus/Response Sequences

1. _user clicks on a button_
2. _detailed instructions on how to play the game appear in text on the screen_

3.2.3 Functional Requirements

_REQ-1: clickable button on the GUI is active on the screen at any time during play_

_REQ-2: typed instructions appear in a easy to read format_

_REQ-3: a new button closes the screen and returns to the game screen._

  1.
## Asking for a Card

3.3.1 Description and Priority

_This allows the user to ask for a card_

_Priority: High - needed to receive a card to progress the game_

3.3.2 Stimulus/Response Sequences

1. _User selects a card in their hand and clicks on it on the GUI_
2. _The user is shown whether they guessed correctly or not. If they did, they may select another card in their hand to &quot;ask&quot; again. if the opponent does not have the card they choose, the deck in the center becomes clickable and ends the asking for card phase._

3.3.3 Functional Requirements

_REQ-1: hand becomes clickable on the users turn, whatever is click designates what the person wants from the opponent_

_REQ-2: when a card is picked, it is compared with the current hand of the opponent_

_REQ-3: if they have the card requested, the opponent loses the card(s) and the asker gains the card(s)_

_REQ-4: end the turn if the opponent does not have another card of equal value_

  1.
## Collecting Books

3.4.1 Description and Priority

_This allows the players to increase their score_

_Priority: High- needed for players to score and win the game_

3.4.2 Stimulus/Response Sequences

1. _Player has 4 cards of the same value in their hand_
2. _the 4 of a kind leaves their hand and increments the score of the player_

3.4.3 Functional Requirements

_REQ-1: Player/AI must have a 4 of a kind in their hand_

_REQ-2: Score must increment once for each 4 of a kind collected_

  1.
## Winning the Game

3.5.1 Description and Priority

_This is the condition for ending the game._

_Priority: High_

3.5.2 Stimulus/Response Sequences

1. _One of the players score increments to 8._
2. _Game ends and the winner is displayed._

3.5.3 Functional Requirements

_REQ-1: First player in the game to a score of 8(depending on the amount of players) wins the game_

  1.
## Ending or Restarting the Game

3.2.1 Description and Priority

_This allows the user to restart or end the game_

_Priority: High_

3.2.2 Stimulus/Response Sequences

1. _user clicks the button to restart or end the game_
2. _Game exits or starts a new session_

3.2.3 Functional Requirements

_REQ-1: One GUI button that restarts the game and starts a fresh instance_

_REQ-2: One GUI button that exits the program_

1.
# E **xternal Interface Requirements**

  1.
## **User Interfaces**

_The GUI will be created using NETBeans development options with the JAVA programming language. The starting page will have a popup interface that shows two options. These two options are &quot;Start Game&quot; and &quot;How to Play&#39;&#39;. Pressing the How to Play button will bring up a popup that gives you a detailed description on how to play the game. Pressing the start button will start the game. The interface will close showing the GUI behind it that shows your cards face up, with your opponent cards faced down. You&#39;ll also be able to see how many points your opponents have. This interface will also have an option to quit the game mid session, bringing you back to the start._ ![](RackMultipart20220221-4-1tatg1d_html_c94e9966f149a0cb.png)

  1.
## **Hardware Interfaces**

## _Go Fish is set to run on any Windows 10 OS. A mouse will be needed that can select options that display in the GUI. Network connection is not needed to play Go Fish._

  1.
## **Software Interfaces**

_JAVA 10.0.2 must be installed. Older and newer versions may work with this game, but have not been tested so you may experience some difficulties._

  1.
## **Communications Interfaces**

_No communications are used in Go Fish._

1.
# **Other Nonfunctional Requirements**

  1.
## **Performance Requirements**

_No performance requirements at this time._

  1.
## **Safety Requirements**

_Contact your physician before playing this game._

  1.
## **Security Requirements**

_Free for use in the USA or territories outside of the USA. Not to be used outside of Earth._

  1.
## **Software Quality Attributes**

_This game can be updated quickly and effectively as JAVA updates._

1.
# **Other Requirements**

_There are currently no requirements. This may be subjected to change._

**Appendix A: Glossary**

_Go - to move from one place to another_

_Fish - a cold-blooded animal that lives in the water_

_User- human intended as the main player for the game_

_hand(s)- current stock of cards for each player. every player has a &quot;hand&quot;_

_AI - Computer player_

_Book - &quot;4 of a kind&quot; or 4 cards of equal number value_

_GUI - Graphical user interface_

**Appendix B: Analysis Models**

![](RackMultipart20220221-4-1tatg1d_html_819def3800c3f0c9.png)

![](RackMultipart20220221-4-1tatg1d_html_225523816009fbae.png)

![](RackMultipart20220221-4-1tatg1d_html_eaaf8e9b5724bea1.png)

![](RackMultipart20220221-4-1tatg1d_html_62b0358fb897c732.png)

![](RackMultipart20220221-4-1tatg1d_html_91df422def0f938d.png)

![](RackMultipart20220221-4-1tatg1d_html_918eec84615cd05e.png)

![](RackMultipart20220221-4-1tatg1d_html_d25faba2b9f93d96.png)

**Appendix C: Issues List**

_This game is currently issues-free._
