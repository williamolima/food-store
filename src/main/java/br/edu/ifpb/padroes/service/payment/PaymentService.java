package br.edu.ifpb.padroes.service.payment;

public class PaymentService {

    public enum PaymentType {
        CREDIT_CARD, DEBIT, BILLET, PAYPAL
    }

    public interface PaymentState {
        PaymentState pay_credit();
        PaymentState pay_debit();
        PaymentState pay_billet();
        PaymentState pay_paypal();
    }

    public class Payment{
        private PaymentState estadoAtual;

        public Payment(){
            this.estadoAtual = new PaymentType;
        }
    }

    public Payment(PaymentState estadoAtual){
        this.estadoAtual = estadoAtual;
    }

    public void pay_credit(){
        this.estadoAtual = estadoAtual.CREDIT_CARD;
    }

    public void pay_debit(){
        this.estadoAtual = estadoAtual.DEBIT;
    }

    public void pay_billet(){
        this.estadoAtual = estadoAtual.BILLET;
    }

    public void pay_paypal(){
        this.estadoAtual = estadoAtual.PAYPAL;
    }


    // public void doPayment(PaymentType type) throws Exception {
    //     switch (type) {
    //         case CREDIT_CARD:
    //             System.out.println("Do credit card payment!");
    //             break;
    //         case DEBIT:
    //             System.out.println("Do debit payment!");
    //             break;
    //         case BILLET:
    //             System.out.println("Do billet payment!");
    //             break;
    //         case PAYPAL:
    //             System.out.println("Do paypal payment!");
    //             break;
    //         default:
    //             throw new Exception("unknown payment method");
    //     }
    // }

}
