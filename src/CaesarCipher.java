public class CaesarCipher {
        private int shifts;

        public CaesarCipher(int shifts) {
            this.shifts = shifts;
        }

        public String encrypt(String message) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                char c = message.charAt(i);
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    c = (char) (base + (c - base + shifts) % 26);
                }
                result.append(c);
            }
            return result.toString();
        }

        public String decrypt(String message) {
            return encrypt(message, 26 - shifts);
        }

        private String encrypt(String message, int shifts) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                char c = message.charAt(i);
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    c = (char) (base + (c - base + shifts) % 26);
                }
                result.append(c);
            }
            return result.toString();
        }
    }
