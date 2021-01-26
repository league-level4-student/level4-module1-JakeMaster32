package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.

	// 3. Make a main method to test your method
	public static void main(String[] args) {
Zodiac []array = Zodiac.values();
int choice = JOptionPane.showOptionDialog(null, "Pick your zodiac sign", "Zodiacs", 0, -1, null, array, 0);
getHoroscope(array[choice]);
	}

	static void getHoroscope(Zodiac zodiac) {
		switch (zodiac) {
		case ARIES: {
			JOptionPane.showMessageDialog(null, "You are eager, dynamic, quick, and competetive");
			break;
		}
		case TAURUS: {
			JOptionPane.showMessageDialog(null, "You are strong, dependable, sensual, and creative");	
				break;
			}
		case GEMINI: {
			JOptionPane.showMessageDialog(null, "You are versatile, expressive, curious, and kind");	
				break;
			}
		case CANCER: {
			JOptionPane.showMessageDialog(null, "You are intuitive, sentimental, compassionate, and protective");	
				break;
			}
		case LEO: {
			JOptionPane.showMessageDialog(null, "You are dramatic, fiery, outgoing, and self-assured");	
				break;
			}
		case VIRGO: {
			JOptionPane.showMessageDialog(null, "You are practical, loyal, gental, and analytical");	
				break;
			}
		case LIBRA: {
			JOptionPane.showMessageDialog(null, "You are social, fair-minded, diplomatic, and gracious");	
				break;
			}
		case SCORPIO: {
			JOptionPane.showMessageDialog(null, "You are passionate, stubborn, resourceful, and brave");	
				break;
			}
		case SAGITTARIUS: {
			JOptionPane.showMessageDialog(null, "You are extroverted, optimistic, funny, and generous");	
				break;
			}
		case CAPRICORN: {
			JOptionPane.showMessageDialog(null, "You are serious, independent, disciplined, and tenacious");	
				break;
			}
		case AQUARIUS: {
			JOptionPane.showMessageDialog(null, "You are deep, imaginative, original, and uncompromising");	
				break;
			}
		case PISCES: {
			JOptionPane.showMessageDialog(null, "You are affectionate, empathetic, wise, and artistic");	
				break;
			}
		
		}

	}
}
