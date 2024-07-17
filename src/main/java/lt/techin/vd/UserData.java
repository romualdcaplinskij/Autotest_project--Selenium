package lt.techin.vd;


    import java.util.Random;

    public class UserData {
        private static String email;
        private static String password;
        private static String firstName;
        private static String lastName;

        private static String[] firstNames = {"Al", "Apu","Bruce", "Bryce", "Bronny", "Cessar", "Kyle", "Demar", "Kylie", "Kyrie", "Magic", "Mose", "John", "Jane", "Alice", "Bob", "Mike", "James", "Alex", "Pete", "Xavier", "Paul", "Anthony", "Larry"};

        private static String[] lastNames = {"Doe", "Smith", "Johnson", "Williams","Harden", "Davis", "Castle", "Evans", "Rivers", "Sumner", "Wallace"};

        public static String getRandomFirstName() {
            Random random = new Random();
            return firstNames[random.nextInt(firstNames.length)];
        }

        public static String getRandomLastName() {
            Random random = new Random();
            return lastNames[random.nextInt(lastNames.length)];
        }

        public static String generateEmail(String firstName, String lastName) {
            return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@gmail.com";
        }

        public static String generatePassword() {
            Random random = new Random();
            char upperCase = (char) (random.nextInt(26) + 'A');
            StringBuilder lowerCases = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                lowerCases.append((char) (random.nextInt(26) + 'a'));
            }
            char digit = (char) (random.nextInt(10) + '0');
            return upperCase + lowerCases.toString() + digit + ",";
        }

        public static void generateUserData() {
            firstName = getRandomFirstName();
            lastName = getRandomLastName();
            email = generateEmail(firstName, lastName);
            password = generatePassword();
        }

        public static String getEmail() {
            return email;
        }

        public static String getPassword() {
            return password;
        }

        public static String getFirstName() {
            return firstName;
        }

        public static String getLastName() {
            return lastName;
        }
    }


