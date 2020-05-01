
  Pod::Spec.new do |s|
    s.name = 'ToastPlugin'
    s.version = '0.0.1'
    s.summary = 'Toast plugin for native Android'
    s.license = 'MIT'
    s.homepage = 'https://github.com/dev-sareno/capacitor-toast-plugin.git'
    s.author = 'Dev Sareno'
    s.source = { :git => 'https://github.com/dev-sareno/capacitor-toast-plugin.git', :tag => s.version.to_s }
    s.source_files = 'ios/Plugin/**/*.{swift,h,m,c,cc,mm,cpp}'
    s.ios.deployment_target  = '11.0'
    s.dependency 'Capacitor'
  end