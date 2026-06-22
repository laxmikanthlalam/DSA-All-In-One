berOfBalloons(String text) {
        int cb = 0, ca = 0, cl = 0, co = 0, cn = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'b') cb++;
            else if (ch == 'a') ca++;
            else if (ch == 'l') cl++;
            else if (ch == 'o') co++;
            else if (ch == 'n') cn++;
        }

        return Math.min(
                Math.min(cb, ca),
                Math.min(cl / 2, Math.min(co / 2, cn))
        );
    }
}


