# Medir Complexidade e Tempo de Ordenação

## Java
```Java
    long tempoInicio, tempoFim;

    tempoInicio = System.nanoTime();
    //rotina1
    tempoFim = System.nanoTime();
    System.out.println("Tempo (ms) rotina 1: " + (tempoFim - tempoInicio)/100000);

    tempoInicio = System.nanoTime();
    //rotina1
    tempoFim = System.nanoTime();
    System.out.println("Tempo (ms) rotina 2: " + (tempoFim - tempoInicio)/100000);

```

## C#
```C#
    Stopwatch sw = new Stopwatch();

    sw.Start();
    //rotina 1
    sw.Stop();
    Console.WriteLine("Fim da rotina 1 (ms): " + sw.ElapsedMilliseconds);
    sw.Reset();

    sw.Start();
    //rotina 2
    sw.Stop();
    Console.WriteLine("Fim da rotina 2 (ms): " + sw.ElapsedMilliseconds);
    sw.Reset();
```

## Python
```python
    tempoInicio = time.time()

    # rotina 1
    tempoFim = time.time()
    print("Tempo de rotina 1: ", (TempoFim - TempoInicio), "s")
```

## C++
```cpp
    clock_t tempoInicio, tempoFim;

    tempoInicio = clock();

    //rotina 1
    tempoFim = clock();
    cout << "Tempo para rotina 1: " << (float) (tempoFim)
```