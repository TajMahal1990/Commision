fun main() {
    println("��������� �������� ���������:")
    var procent = 0.75 // ��������
    var sum = 1000 // ����� ��������
    var minimum = 35 // ����������� ����� ��������
    var resultCom = sum / 100 * procent
    var resultSum =sum - resultCom

    println("�� ������ ��������� $sum ������")

    if (sum >= minimum) {
        println("�������� �������� $resultCom ������")
        println("����� ���������� � ������ �������� $resultSum ������")
    } else {
        println("����������� ����� ��� �������� 35 ������")
    }
}


