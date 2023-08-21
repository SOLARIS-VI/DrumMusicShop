# Drumeo Music Shop - Code Model

A detailed model of the Drumeo Music Shop, encapsulating various instruments and their functionalities. 

## Features:
1. **Interfaces**:
   - IPlay: Represents musical instruments that can be played.
   - ISell: Represents items that the shop can sell, including their buying and selling prices.

2. **Instrument Superclass**:
   - Abstract class that forms the basis for specific instrument classes.
   - Contains common attributes like material, color, and type.

3. **Instrument Types**:
   - Bongos
   - Cajon
   - Cymbals
   - CymbalStands
   - CymbalRacks
   - Djembe
   - DrumKit
   - DrumSticks

4. **Shop Class**:
   - Maintains a collection of items that the shop can sell.
   - Functionalities include adding and removing items from stock, and calculating potential profit.

5. **Test Files**:
   - BongoTest
   - CajonTest
   - CymbalTest
   - CymbalStandsTest
   - CymbalRacksTest
   - DjembeTest
   - DrumKitTest
   - DrumSticksTest
   - ShopTest

6. **Enums**:
   - For differentiating instrument types.

## Installation & Setup

1. Clone this repository.
2. Ensure you have the required libraries and environment set up.
3. Navigate to the source folder and compile the necessary files.
4. Run the tests to confirm that everything is functioning as expected.

## Contribution

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)
