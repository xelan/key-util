# KeyUtil

This utility allows the secure generation of 256-bit AES keys and the checksum calculation according to the [Austrian Federal Ministry of Finance](https://www.bmf.gv.at/egovernment/projekte/registrierkassen/AES_Pruefsummenberechnung_200716_3.pdf).

## Requirements

* Java Runtime 8 or higher
* Tested on JRE 1.8.0.121

## Installation (Windows)

1. Extract the ZIP package to a folder
2. Launch `KeyUtil.exe`

## Installation (others)
1. Make sure java is installed and in your $PATH
2. Extract the ZIP package to a folder
3. Execute `java -jar KeyUtil.jar`

## Usage

Click `Generate` to generate a base64-encoded 256-bit key or import an existing one by pasting it into the key input.

Then, click `Calculate` to calculate the checksum.

## Testing

The JUnit test suite can be found in the `test` folder.

## License

This utility is licensed under the [Apache license 2.0](http://www.apache.org/licenses/LICENSE-2.0).