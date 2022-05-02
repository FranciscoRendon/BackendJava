public class FadeRun {
    public static void main(String[] args) throws InterruptedException {
        TestFadeRun();
    }

    private static void TestFadeRun() throws InterruptedException {
        Screen screen = new Screen();
        PersonFade fade = new PersonFade(
                01,
                "Fade",
                "Casarrecompensas",
                "Moderate",
                "Fade, la cazarrecompensas turca, desata el poder de las pesadillas para apoderarse de los secretos del enemigo. En armonía con el terror puro, acecha a sus objetivos y revela sus miedos más profundos antes de aplastarlos en la oscuridad."
        );
        Runnable attack = new Runnable() {
            @Override
            public void run() {
                try {
                    fade.Acechadora(screen);
                    Thread.sleep(3000);

                    fade.Capturar(screen);
                    Thread.sleep(3000);

                    fade.Atormentar(screen);
                    Thread.sleep(3000);

                    fade.Anochecer(screen);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        Thread attackPersonFade = new Thread(attack);
        attackPersonFade.start();
    }

}


