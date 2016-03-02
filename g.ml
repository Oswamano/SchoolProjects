fun g([], f) = []
 | g(x::t, f) = f(x) :: g(t,f);

